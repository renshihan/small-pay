package com.renshihan.pay.frame.entity;


public class BankResponse<T> {
    private T response;
    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
