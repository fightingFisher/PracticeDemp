package java18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.text.ChangedCharSetException;

import 简单工厂1.test;

public class Test {

	public static void main(String[] args) {
		String[] a = { "s", "b", "a", "m" };
		List<String> names2 = Arrays.asList(a);
		names2.sort(Comparator.nullsLast(String::compareTo));
		// System.out.println(names2);
		Predicate<String> predicate = s -> {
			s = s + "asdasd";
			return s.length() > 7;
		};
		// System.out.println(predicate.test("1234"));
		// System.out.println(predicate.negate().test("1234"));
		Function<String, Integer> toInteger = Integer::valueOf;
		// System.out.println(toInteger.apply("123"));

		// 构造
		Supplier<Person> personSupplier = Person::new;
		personSupplier.get();

		Consumer<Person> personComsumer = p -> System.out.println("hello"
				+ p.getName());

		personComsumer.accept(personSupplier.get());
		
	}

	public int[] quickSortMain(int[] a) {
		int[] result = a;
		quickSort(a)
		Arrays.sort(a);
		return result;
	}

	void quickSort(int a[],int left,int right){  
	    int i=left,j=right;  
	    int pivot=a[left];      //设最左的待排数组为基数  
	    for(;;){  
	        while(i<j&&a[j]>=pivot)    //j从右到左找比基数小的数  
	            j--;  
	        while(i<j&&a[i]<=pivot)    //i从左到右找比基数大的数  
	            i++;  
	        if(i<j)                    //i<j,交换找出符合条件的两数  
	            swap(a[i],a[j]);  
	        else                       //否则第一次循环结束，i左侧的数比基数都小，i右侧的数比基数都大  
	            break;  
	    }  
	    swap(a[i],a[left]);  
	    if(left<right)            //判断数组长度是否大于1，至少有两数才需继续递归  
	        quickSort(a,left,i-1);  
	    if(left<right)  
	        quickSort(a,i+1,right);  
	}  
	

}
