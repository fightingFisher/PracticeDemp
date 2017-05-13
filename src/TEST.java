import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import org.omg.CORBA.PUBLIC_MEMBER;

import DateAndtrChange.Test;

public class TEST {

	public void test1() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = "ab" + "c";
		String s5 = "ab";
		String s6 = "c";
		String s7 = s5 + s6;
		String s8 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s7);
		System.out.println(s1 == s4);
		System.out.println(s3 == s8);
		System.out.println("abc" == s4);
	}

	public static void test2() {
		String s = null;
		if ((s != null) | (s.length() == 0)) {
		}
		;
	}

	public static void test3() {
		int a = 0;
		int c = 0;
		do {
			--c;
			a = a - 1;
		} while (a > 0);
		System.out.println(c);
	}

	public static void test4() {
		String[] a = new String[10];
		System.out.println(a[9]);
	}

	public static void test5() {
		int a = (11 + 3 * 8) / 4 % 3;
		System.out.println(a);
	}

	public static void test6() {
		Vector<String> a = new Vector<String>();
		a.add("1");
		a.add("2");
	}

	public static void test7() {
		String a  = new String("sb");
		if("sb"==a){
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		
	}
}