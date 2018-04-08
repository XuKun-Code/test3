package com.test6;

public class TrycatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TrycatchTest tct=new TrycatchTest();

int result =tct.test();
System.out.println("test()方法执行完毕"+result);
	}

	public int test() {
		int divider =10;
		int result =100;
		try {
			while(divider>- 1) {
				divider--;
				result=result+100/divider;
			}
			return result;
		}catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
			System.out.println("抛出异常了！！");
			return -1;
		}
	}
	
	
	
}
