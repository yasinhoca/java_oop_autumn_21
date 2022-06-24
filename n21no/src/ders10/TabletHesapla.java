package ders10;

public class TabletHesapla extends Urun {
	float indirim = 0.25f;
	
	@Override
	float fatura(float fiyat, float otv, float kdv) {
		fiyat -= fiyat*this.indirim;
		fiyat += fiyat*otv;
		fiyat += fiyat*kdv;
		return fiyat;
	}

}
