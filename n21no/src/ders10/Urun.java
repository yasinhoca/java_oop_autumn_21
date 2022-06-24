package ders10;

public abstract class Urun {
	String tur;
	float fiyat;
	float otv;
	float kdv;
	
	abstract float fatura(float fiyat,float otv,float kdv);
}
