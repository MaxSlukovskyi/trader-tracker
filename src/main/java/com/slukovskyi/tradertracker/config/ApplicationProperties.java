package com.slukovskyi.tradertracker.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:/application.yml")
public class ApplicationProperties {

    @Component
    @ConfigurationProperties(value = "binance.api")
    public static class BinanceApi {

        @Value("${url}")
        public String url;

        @Value("${apiKey}")
        public String apiKey;

        @Value("${secretKey}")
        public String secretKey;

    }

}
