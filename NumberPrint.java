package array;

import java.util.Scanner;

public class NumberPrint {

	public static void main(String[] args) {
		System.out.println("name" +" (i+1) + is:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String names[] = new String[size];
		for(int i=0; i<size; i++) {
			names [i]=sc.next();
			for(int j=0; j<size; j++) {
				System.out.println("name" +" (i+1) + is:"+names[i]);
				}
			}
	}

}
