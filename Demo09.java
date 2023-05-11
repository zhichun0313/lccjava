package tw.com.code.demo;

import org.junit.jupiter.api.Test;

public class Demo09 {
	@Test
	 public void test01() {
		 for(int i=1;i<=100;i++) {
			  if(i%3==0) {
				  System.out.println(i);
			  }
		  }
	 }
	@Test
	public void test02() {
		int sum=0;
		int count=0;
		for(int i=1;i<=10;i++) {
			sum +=i;
			count++;
		}
		System.out.println("sum="+sum);
		System.out.println("count="+count);
	}
}
