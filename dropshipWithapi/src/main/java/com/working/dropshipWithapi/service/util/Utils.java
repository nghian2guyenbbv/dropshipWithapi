package com.working.dropshipWithapi.service.util;

import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.UnknownHttpStatusCodeException;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class Utils {
  @Value("${shopee.service.cookie}")
  private static String shopeeCookie;

  @Autowired
  private RestTemplate restTemplate;

  public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> httpEntity,
      Class<T> responseClazz) {
    final ResponseEntity<T> responseEntity;
    final URI uri;
    try {
      uri = new URL(url).toURI();
    } catch (MalformedURLException | URISyntaxException ex) {
      System.out.println(ex.getMessage());
      return ResponseEntity.badRequest().build();
    }
    try {
      responseEntity = restTemplate.exchange(uri, method, httpEntity, responseClazz);
    } catch (HttpClientErrorException ex) {
      System.out.println(ex.getResponseBodyAsString());
      throw ex;
    } catch (HttpServerErrorException ex) {
      System.out.println(ex.getResponseBodyAsString());
      throw ex;
    } catch (UnknownHttpStatusCodeException ex) {
      System.out.println(ex.getResponseBodyAsString());
      throw ex;
    }

    return responseEntity;
  }

  protected static <T> HttpEntity<T> toHttpEntity(T body, boolean isShoppeCreateProduct) {
    final Map<String, String> headerMap = new LinkedHashMap<>();
    if (isShoppeCreateProduct) {
      headerMap.put("Cookie", Utils.shopeeCookie);
    }
    ;
    return toHttpEntity(defaultHttpHeaders(headerMap), body);
  }

  public static <T> HttpEntity<T> toHttpEntity(HttpHeaders httpHeaders, T body) {
    HttpHeaders defHttpHeaders = httpHeaders != null ? httpHeaders : defaultHttpHeaders(Collections.emptyMap());

    if (Objects.isNull(body)) {
      return new HttpEntity<>(defHttpHeaders);
    }
    return new HttpEntity<>(body, defHttpHeaders);
  }

  public static HttpHeaders defaultHttpHeaders(Map<String, String> values) {
    final HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
    httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

    if (!MapUtils.isEmpty(values)) {
      httpHeaders.setAll(values);
    }

    return httpHeaders;
  }
}
