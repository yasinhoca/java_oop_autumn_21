package ders00;

import java.util.Scanner;

public class ana {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("A say�s�n� giriniz:");
		a = scan.nextInt();
		System.out.println("B say�s�n� giriniz:");
		b = scan.nextInt();
		
		hesapla h = new hesapla();//constructer burada �al���r
		//hesapla h = new hesapla(5,8); overload edilen constructer �al���r
		int sonuc = h.topla(a, b);
		System.out.println(sonuc);
		h.topla(4, 9, 13); //overload edilen topla() �al���r

		hesaplayeni hy = new hesaplayeni();
		System.out.println(hy.topla(3, 5));
		
		
	}

}
