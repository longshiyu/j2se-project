package org.light4j.j2se.sample.innerClass.staticInnerClass;

public class StaticInnerClassTest {
	private int prop1 = 5;
	private static int prop2 = 9;

	static class StaticInnerClass {
		// 静态内部类里可以包含静态成员
		private static int age;

		public void accessOuterProp() {
			// 下面代码出现错误
			// 静态内部类无法访问外部类的实例成员
			// System.out.println(prop1);
			// 下面代码正常
			System.out.println(prop2);
		}
	}
}
