package com.cc.democachemgr.request;

public interface RequestFinishHandler<T> {

    public void onRequestFinish(T data);
}