package com.slukovskyi.tradertracker.config;

import com.slukovskyi.tradertracker.utils.SignatureInterceptor;
import feign.RequestInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Slf4j
public class SignedEndpointFeignConfiguration extends BinanceDefaultFeignConfiguration {

    public SignedEndpointFeignConfiguration(ApplicationProperties.BinanceApi binanceApi) {
        super(binanceApi);
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new SignatureInterceptor(binanceApi);
    }

}
