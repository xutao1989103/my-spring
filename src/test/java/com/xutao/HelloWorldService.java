package com.xutao;

/**
 * Created by xtao on 2016/2/28.
 */
public class HelloWorldService {

    private String text;

    public void hello() {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
