package com.example.pengxl.pxlmvpmdel.base.http;

/**
 * Created by pengxl on 2017-2-15.
 */
public class HttpResult<T> {
    public static final String CODE_OK = "SUCCESS";

    private int count;
    private int start;
    private int total;
    private String title;

    //用来模仿Data
    private T subjects;

    public static String getCodeOk() {
        return CODE_OK;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public T getSubjects() {
        return subjects;
    }

    public void setSubjects(T subjects) {
        this.subjects = subjects;
    }
}
