package net.biancheng.eurekaclientarticleservice.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

    public FeignBasicAuthRequestInterceptor() {
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        // 业务逻辑
    }
}
