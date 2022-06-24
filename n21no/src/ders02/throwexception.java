package ders02;

import java.util.Scanner;

public class throwexception {
	
	static float ortalama(int v,int f) {
		float ort=0;
		if(v>100 || v<0 || f>100 || f<0) {
			throw new ArithmeticException("Notlar 0-100 aras�nda olmal�!");
		} else {
			ort = (float) ((float)v*0.4+ (float)f*0.6);
		}
		
		return ort;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Vize giriniz:");
		int v = s.nextInt();
		System.out.println("Final giriniz:");
		int f = s.nextInt();
		System.out.println("Ortalaman�z:"+ortalama(v, f));
	}

}
