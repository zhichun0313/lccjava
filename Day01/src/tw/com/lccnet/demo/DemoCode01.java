package tw.com.lccnet.demo;

import org.junit.jupiter.api.Test;

public class DemoCode01 {
	@Test
	public void test01() {
		byte a=10;
		byte b=20;
		/*
		 *  被除數/除數=商.....餘
		 */
		byte c=(byte)(a%b);
		System.out.println(c); //10

	}
	@Test
	public void test02() {
		boolean c=10>5;
		boolean v=10==10;
		boolean g=10 !=5;
		
		if(c) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	@Test
	public void test03() {
		int a=20;
		int b=10;
		
		String message="";
		if(b>a) {
			message="1";
			System.out.println("1");
		}else if(a==6) {
			message="2";
			System.out.println("2");
		}else if(b==10){
			message="3";
			System.out.println("3");
		}else {
			message="other";
			System.out.println("other");
		}
		System.out.println(message);
	}
	@Test
	public void test04() {
		int x=1;
		switch(x) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
	@Test
	public void test05() {
		int ans=getTest(1);
		System.out.println(ans);
	}
	
	public int getTest(int a) {
		switch(a) {
		case 1:
			return 100;
		case 2:
			return 200;
		case 3:
			return 300;
			
		}
		return 0;
	}
	@Test
	public void test06() {
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
	}
	@Test
	public void test07() {
		int i=0;
		while(i<100) {
			System.out.println(i);
			i++;
		}
	}
	@Test
	public void test08() {
		int i;
		for(i=0;i<100;i++) {
			System.out.println(i);
		}
	}

}
