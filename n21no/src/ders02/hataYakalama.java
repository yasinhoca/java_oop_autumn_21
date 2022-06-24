package ders02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hataYakalama {

	public static void main(String[] args) {
		// try-catch
		/*
		try {
			int sonuc = 19 / 0;
			System.out.println(sonuc);
		} catch (ArithmeticException e) {
			System.out.println("Hata : " + e.getMessage());
		} */
		
		try {
			int a,b,sonuc;
			Scanner scan = new Scanner(System.in);
			System.out.println("�lk say�:");
			a = scan.nextInt();
			System.out.println("�kinci say�:");
			b = scan.nextInt();
			sonuc = a + b;
			System.out.println(sonuc);
		
		} catch(InputMismatchException e) {
			System.out.println("L�tfen integer de�er giriniz!");
			System.out.println("Hata :" + e.getMessage());
		} finally {
			System.out.println("Ne olursa olsun yap�lacak son i�!");
		}

	}

}
