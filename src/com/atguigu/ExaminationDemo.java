package com.atguigu;

public class ExaminationDemo {

	public static void main(String[] args) {
		System.out.println("1运行 ExaminationDemo 中的 main 函数， 创建 D 类实例");
		new D();
	}
}
 
class E {
	// E的构造器
	E() {
		System.out.println("8执行 E 的构造函数");
	}
 
	// E的普通成员方法
	public void funcOfE() {
		System.out.println("12执行 E 的函数");
	}
}
 
class F {
	// F的构造器
	F() {
		System.out.println("2执行 F 的构造函数");
	}
 
	// F的普通成员方法
	public void funcOfF() {
		System.out.println("4执行 F 的函数");
	}
}
 
class B {
	//new了一个E对象
	E e = new E();
	//B的静态成员变量
	static F f = new F();
	//B的普通成员变量
	public String sb = getSb();
	//B的静态代码块
	static {
		System.out.println("3执行 B 类的 static 块(B 包含 E 类的成员 变量,包含静态 F 类成员变量)");
		f.funcOfF();
	}
	//B的匿名代码块
	{
		System.out.println("10执行 B 实例的普通初始化块");
	}
	//B的构造器
	B() {
		System.out.println("11执行 B 类的构造函数(B 包含 E 类的成员变 量,包含静态 F 类成员变量)");
	}
	//B的普通成员方法
	public String getSb() {
		System.out.println("9初始化 B 的实例成员变量 sb");
		return "sb";
	}
}
 
class C extends B {
	// C的静态代码块
	static {
		System.out.println("5执行 C 的 static 块(C 继承 B)");
	}
	// C的匿名代码块
	{
		System.out.println("13执行 C 的普通初始化块");
	}
 
	// C的构造器
	C() {
		System.out.println("14执行 C 的构造函数(C 继承 B)");
	}
}
 
class D extends C {
	// D的静态成员变量
	public String sd1 = getSd1();
	// D的普通成员变量
	public static String sd = getSd();
	// D的静态代码块
	static {
		System.out.println("7执行 D 的 static 块(D 继承 C)");
	}
	// D的匿名代码块
	{
		System.out.println("16执行 D 实例的普通初始化块");
	}
	// D的构造器
	D() {
		System.out.println("17执行 D 的构造函数(D 继承 C);父类 B 的实 例成员变量 sb 的值为：" + sb + ";本类 D 的 static 成员变量 sd 的值为：" + sd
				+ "; 本类 D 的实例成员变量 sd1 的值是：" + sd1);
	}
	// D的静态成员方法（调用时才加载）
	static public String getSd() {
		System.out.println("6初始化 D 的 static 成员变量 sd");
		return "sd";
	}
	// D的普通成员方法
	public String getSd1() {
		System.out.println("15初始化 D 的实例成员变量 sd1");
		return "sd1";
	}

}
