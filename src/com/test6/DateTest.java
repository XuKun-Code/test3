package com.test6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//默认格式： 星期 月 号  时分秒 cst代表中国标准时间 年
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today=sdf.format(d);
		System.out.println(today);
		
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		int hour=c.get(Calendar.HOUR_OF_DAY);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
		
		Date date=c.getTime();
		System.out.println(date);
	}

}
