package com.slukovskyi.tradertracker.config;

import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

public class BinanceDefaultFeignConfiguration {

    protected final ApplicationProperties.BinanceApi binanceApi;

    public BinanceDefaultFeignConfiguration(ApplicationProperties.BinanceApi binanceApi) {
        this.binanceApi = binanceApi;
    }

    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }

    @Bean
    public Encoder encoder() {
        return new JacksonEncoder();
    }

    @Bean
    public Decoder decoder() {
        return new ResponseEntityDecoder(new SpringDecoder(feignHttpMessageConverter()));
    }

    public ObjectFactory<HttpMessageConverters> feignHttpMessageConverter() {
        final HttpMessageConverters httpMessageConverters = new HttpMessageConverters(new GateWayMappingJackson2HttpMessageConverter());
        return () -> httpMessageConverters;
    }

    public static class GateWayMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
        GateWayMappingJackson2HttpMessageConverter() {
            List<MediaType> mediaTypes = new ArrayList<>();
            mediaTypes.add(MediaType.APPLICATION_JSON);
            setSupportedMediaTypes(mediaTypes);
        }
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return (RequestTemplate template) -> template.header("X-MBX-APIKEY", binanceApi.apiKey);
    }

}
