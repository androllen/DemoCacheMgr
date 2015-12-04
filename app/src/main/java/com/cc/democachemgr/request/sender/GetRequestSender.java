package com.cc.democachemgr.request.sender;

import java.net.HttpURLConnection;

import com.cc.democachemgr.request.IRequest;

public class GetRequestSender extends BaseRequestSender {

    public GetRequestSender(IRequest<?> request, HttpURLConnection httpURLConnection) {
        super(request, httpURLConnection);
    }

    @Override
    public void send() {

    }
}
