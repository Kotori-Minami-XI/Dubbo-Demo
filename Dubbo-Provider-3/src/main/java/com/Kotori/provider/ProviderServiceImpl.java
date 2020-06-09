package com.Kotori.provider;

import com.Kotori.Interface.ProviderService;

public class ProviderServiceImpl implements ProviderService {
    public String SayHello(String word) {
        return word+ "Provider-3收到这个调用请求";
    }
}
