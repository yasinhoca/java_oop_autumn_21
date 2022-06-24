package ders10;

public class BilgisayarHesapla extends Urun {
	float indirim = 0.1f;
	
	@Override
	float fatura(float fiyat, float otv, float kdv) {
		fiyat -= fiyat*this.indirim;
		fiyat += fiyat*otv;
		fiyat += fiyat*kdv;
		return fiyat;
	}

}
