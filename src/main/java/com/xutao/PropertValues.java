package com.xutao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xtao on 2016/3/30.
 */
public class PropertValues {

    private List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertValues() {
    }

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
