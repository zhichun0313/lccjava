package tw.com.code.demo;

import java.util.Scanner;

public class Demo08 {
	
	 public static void main(String[] args) {
	        // 假設這是已經註冊過的使用者帳號和密碼
	        String username = "ann";
	        String password = "pass123";

	        Scanner scanner = new Scanner(System.in);
	        
	       

	        System.out.println("慶輸入帳號密碼");
	        
	        System.out.println("慶輸入帳號:");
	        String inputUsername = scanner.next();
	        
	        System.out.println("請輸入密碼:");
	        String inputPassword = scanner.next();
	        
	        if(inputUsername.equals(username) && inputPassword.equals(password)) {
	        	System.out.println("輸入正確，登入成功");
	        }else {
	        	System.out.println("帳號或密碼有誤，重新輸入");
	        }
	    }
}
