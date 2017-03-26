package org.light4j.j2se.sample.genericity.deep.notExist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 运行下面的代码片段,可能有人会认为应该输出false,但是实际上输出true。 因为不管泛型的实际参数是什么,它们在运行时总有同样的类(class)。
 * 不管为泛型的类型形参传入哪一种类型实参，对于java类型来说，他们依然被当成同一个类处理，在内存中也只占用一块内存空间，因此在静态方法，
 * 静态初始化块或者静态变量的声明和初始化中不允许使用类型形参。
 */
public class TestNotExistGenericity {
	public static void main(String[] args) {
		// 分别创建List<String>对象和List<Integer>对象
		List<String> l1 = new ArrayList<String>();
		List<Integer> l2 = new ArrayList<Integer>();
		// 调用getClass()方法来比较l1和l2的类是否相等
		System.out.println(l1.getClass() == l2.getClass());

		// 由于系统中并不会真正生成泛型，所以instanceof运算符后不能使用泛型类。例如，下面代码是错误的：
		Collection cs = new ArrayList<String>();
		// 下面代码编译时引起错误，Instanceof运算符后不能使用泛型
		// if (cs instanceof List<String>) {
		// }
	}
}