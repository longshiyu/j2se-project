package org.light4j.j2se.sample.genericity.basic.useGenericity;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
	public static void main(String[] args) {
		// 创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();
		strList.add("org.light4j");
		strList.add("com.light4j");
		strList.add("com.longjiazuo");
		// 下面代码将引起编译错误
		// strList.add(5);
		for (int i = 0; i < strList.size(); i++) {
			// 下面代码无须强制类型转换
			String str = strList.get(i);
		}
	}
}
