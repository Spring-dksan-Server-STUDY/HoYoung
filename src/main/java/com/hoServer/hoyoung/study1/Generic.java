package com.hoServer.hoyoung.study1;

public class Generic<T> {
    private T data;

    public Generic(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printData(){
        System.out.println(this.data);
    }
}
