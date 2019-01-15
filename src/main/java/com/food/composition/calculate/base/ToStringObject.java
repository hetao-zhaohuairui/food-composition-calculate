package com.food.composition.calculate.base;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 转换成字符串对象
 *
 * @author H.R.ZHAO
 */
public class ToStringObject {

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
