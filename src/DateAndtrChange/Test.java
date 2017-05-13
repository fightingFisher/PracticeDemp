package DateAndtrChange;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Test {
	
	

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		
		
		
	String a = "2015-08-08 05:05:30";
	Date now = new Date();
	Test test =  new Test();
	System.out.println("str to date:"+test.StrChangeDate(a));
	System.out.println("date to str:"+ test.DateChangeStr(now));
	}
	
	
	
	
	public Date StrChangeDate(String sb) {
		Date result = null;
		try {
			SimpleDateFormat biaozhun = new SimpleDateFormat(
					"yyyy-MM-dd hh:mm:ss");
			result = biaozhun.parse(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public String DateChangeStr(Date date){
		SimpleDateFormat biaozhun = new SimpleDateFormat("yyyy-MM-dd");
		String result =  biaozhun.format(date);
		return result;
	}
}
