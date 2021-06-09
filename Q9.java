package CODING_WIZARD;

import java.util.*;

public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=sc.nextLine();
		StringBuilder a=new StringBuilder(s);
		a.reverse();
		String rev=a.toString();
		System.out.println("The Reverse is : "+rev);
	}

}
