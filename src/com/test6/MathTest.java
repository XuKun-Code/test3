package com.test6;

import org.omg.CORBA.MARSHAL;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=12.81;//定义一个double类型的变量	
		int b=(int)a; //将double类型强制转换为int类型，去掉小数位。
		System.out.println(b);
		
		long c=Math.round(a);//调用round方法，进行四舍五入
		System.out.println(c);
		
		double d=Math.floor(a); // 调用floor方法，返回小于参数的最大整数；
		System.out.println(d);
		
		double e=Math.ceil(a); //调用ceil方法，返回大于参数的最小整数；
		System.out.println(e);
		
		double x=Math.random(); //调用random方法，产生【0，1)之间的随机数浮点数
		System.out.println(x);
		
		int y=(int)(Math.random()*99); //产生[0,99)之间的随机整数
		System.out.println(y);
		
	}

}
