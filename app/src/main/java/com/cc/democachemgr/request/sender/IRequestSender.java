package com.cc.democachemgr.request.sender;

import java.io.IOException;

public interface IRequestSender {

    void setup() throws IOException;

    void send() throws IOException;
}
