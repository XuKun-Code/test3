package com.test6;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "学习 JAVA 编程1";
		System.out.println("字符串的长度"+str.length());
//		char c='编';
		System.out.println("字符'编'的位置："+str.indexOf("2"));
		System.out.println(str.indexOf("JAVA"));
		System.out.println(str.indexOf("imooc"));
		//按空格把字符串拆分成一个数组，并输出数组元素
		String[] arr=str.split("");
		System.out.println(Arrays.toString(arr));
		
		//获取索引位置[3,7)之前的字符串 
		System.out.println(str.substring(3,7));
		
		System.out.println();
		   // Java文件名
				String fileName = "HelloWorld.java"; 
		        // 邮箱
				String email = "laurenyang@imooc.com";
				
				// 判断.java文件名是否正确：合法的文件名应该以.java结尾
		        /*
		        参考步骤：
		        1、获取文件名中最后一次出现"."号的位置
		        2、根据"."号的位置，获取文件的后缀
		        3、判断"."号位置及文件后缀名
		        */
		        //获取文件名中最后一次出现"."号的位置
				int index = fileName.indexOf(".");
		        System.out.println(index);
		        // 获取文件的后缀   获取[10,15)之间的字符串
				String prefix = fileName.substring(10,15);
		        System.out.println(prefix);
				// 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
				if (index!=-1  && index!=0 && prefix.equals(".java") ) {
					System.out.println("Java文件名正确");
				} else {
					System.out.println("Java文件名无效");
				}

		        // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
		         /*
		        参考步骤：
		        1、获取文件名中"@"符号的位置
		        2、获取邮箱中"."号的位置
		        3、判断必须包含"@"符号，且"@"必须在"."之前
		        */
			    // 获取邮箱中"@"符号的位置
				int index2 = email.indexOf("@");
		        
		        // 获取邮箱中"."号的位置
				int index3 = email.indexOf('.');
		        
				// 判断必须包含"@"符号，且"@"必须在"."之前
				if (index2 != -1 && index3 > index2) {
					System.out.println("邮箱格式正确");
				} else {
					System.out.println("邮箱格式无效");
				}
		
		
				//将字符串转换为小写
			System.out.println("转换为小写:"+str.toLowerCase());	
				//获取索引位置为1的字符
			System.out.println(str.charAt(1));
				//将字符串转换为 byte[],并打印输出	
	
			byte[] b=str.getBytes();
			System.out.println("转换为字节数组");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
			
			
			System.out.println();
		
			//创建stringBuilder对象，存储字符串
			StringBuilder str3=new StringBuilder("hello");
			str3.append(" imooc");
			str3.append(520);
			System.out.println("字符串的长度"+str3.length()+" "+str3);
		 
			str3.insert(11, "!");
			System.out.println(str3);
			
			String s4=str3.toString();
			System.out.println(s4);
			
			
			
			
		
	}

}
