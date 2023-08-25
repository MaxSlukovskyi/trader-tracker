package com.slukovskyi.tradertracker.utils;

import com.slukovskyi.tradertracker.config.ApplicationProperties;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class SignatureInterceptor implements RequestInterceptor {

    protected final ApplicationProperties.BinanceApi binanceApi;


    @Override
    public void apply(RequestTemplate template) {
        addApiKeyToHeader(template);
        addSignatureToQueryParams(template);
    }

    private void addApiKeyToHeader(RequestTemplate template) {
        template.header("X-MBX-APIKEY", binanceApi.apiKey);
    }

    private void addSignatureToQueryParams(RequestTemplate template) {
        final String signature = Signature.encode(binanceApi.secretKey, getQueryLineWithoutQuestionMark(template));
        template.query("signature", signature);
    }


    private static String getQueryLineWithoutQuestionMark(RequestTemplate template) {
        return template.queryLine().substring(1);
    }

}
