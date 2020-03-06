package com.food.composition.calculate.base;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 转换成字符串对象
 * 
 * @author H.R.ZHAO
 *
 * @version ToStringObject.java, v 0.1 2020年03月06日 11:46:27 H.R.ZHAO Exp $
 */
public class ToStringObject {

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
