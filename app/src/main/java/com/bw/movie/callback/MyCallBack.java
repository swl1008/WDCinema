package com.bw.movie.callback;

public interface MyCallBack<T> {

    void onSuccess(T data);
    void onFail(String error);
}
