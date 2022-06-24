package ders10;

public class TelefonHesapla extends Urun {
	float indirim = 0.15f;
	
	@Override
	float fatura(float fiyat, float otv, float kdv) {
		fiyat -= fiyat*this.indirim;
		fiyat += fiyat*otv;
		fiyat += fiyat*kdv;
		return fiyat;
	}

}
