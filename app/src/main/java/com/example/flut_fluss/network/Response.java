package com.example.flut_fluss.network;

public final class Response<T> {

    private int status;
    private String message;
    private T data;

    public int getStatus() {

        return status;
    }

    public void setStatus(int status) {

        this.status = status;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String value) {

        this.message = value;
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {

        this.data = data;
    }
}
