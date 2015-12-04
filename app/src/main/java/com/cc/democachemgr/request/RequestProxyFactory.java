package com.cc.democachemgr.request;

public interface RequestProxyFactory {
    IRequestProxy createProxyForRequest(IRequest request);
}
