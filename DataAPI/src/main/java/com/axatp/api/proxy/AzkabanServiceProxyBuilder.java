package com.axatp.api.proxy;


import com.axatp.api.service.AzkabanService;
import com.axatp.api.serviceImpl.AzkabanServiceImpl;

import java.lang.reflect.Proxy;

/**
 * com.azkaban api Builder
 */
public class AzkabanServiceProxyBuilder {
    private String uri;
    private String username;
    private String password;

    private AzkabanServiceProxyBuilder() {
    }


    public static AzkabanServiceProxyBuilder create() {
        return new AzkabanServiceProxyBuilder();
    }

    public AzkabanServiceProxyBuilder setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public AzkabanServiceProxyBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public AzkabanServiceProxyBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public AzkabanService build() {
        AzkabanServiceImpl impl = new AzkabanServiceImpl(this.uri, this.username, this.password);
        ApiInvocationHandler handler = new ApiInvocationHandler(impl);
        return (AzkabanService) Proxy.newProxyInstance(
                impl.getClass().getClassLoader(),
                impl.getClass().getInterfaces(),
                handler);
    }

}
