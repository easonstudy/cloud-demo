package com.example.feginservice.service;

public class SmsRemoteImpl implements SmsRemote {

    @Override
    public String send(String msg) {
        return "send fall back:" + msg;
    }

    @Override
    public String dosend(String msg) {
        return "dosend fall back:" + msg;
    }
}
