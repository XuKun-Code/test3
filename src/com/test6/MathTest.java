package com.test6;

import org.omg.CORBA.MARSHAL;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=12.81;//����һ��double���͵ı���	
		int b=(int)a; //��double����ǿ��ת��Ϊint���ͣ�ȥ��С��λ��
		System.out.println(b);
		
		long c=Math.round(a);//����round������������������
		System.out.println(c);
		
		double d=Math.floor(a); // ����floor����������С�ڲ��������������
		System.out.println(d);
		
		double e=Math.ceil(a); //����ceil���������ش��ڲ�������С������
		System.out.println(e);
		
		double x=Math.random(); //����random������������0��1)֮��������������
		System.out.println(x);
		
		int y=(int)(Math.random()*99); //����[0,99)֮����������
		System.out.println(y);
		
	}

}
