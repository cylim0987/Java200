package java01;

import java.util.Scanner;

public class address {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("주소: ");
		String address = stdIn.nextLine();
		
		System.out.println("주소는 " + address + "입니다. ");
	}

}
