package org.light4j.j2se.sample.genericity.deep.derivative;

import org.light4j.j2se.sample.genericity.deep.define.Apple;

public class A1 extends Apple<String> {
	// 正确重写了父类的方法，返回值与父类Apple<String>的返回值完全相同
	public String getInfo() {
		return "子类" + super.getInfo();
	}

	// 下面方法是错误的，重写父类方法时返回值类型不一致
	/*public Object getInfo() {
		return "子类";
	}*/
}
