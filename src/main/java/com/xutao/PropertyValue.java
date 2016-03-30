package com.xutao;

/**
 * Created by xtao on 2016/3/30.
 */
public class PropertyValue {

    private final String name;

    private final String value;

    public PropertyValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
