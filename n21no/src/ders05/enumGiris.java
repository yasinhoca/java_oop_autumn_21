package ders05;

import java.awt.Color;

enum Gunler{   //Color.RED
	PAZARTES�,  
	SALI,
	�AR�AMBA,
	PER�EMBE,
	CUMA,
	CUMARTES�,
	PAZAR
}

public class enumGiris {

	public static void main(String[] args) {
		Gunler g = Gunler.PAZARTES�;
		System.out.println(g);
		System.out.println(g.compareTo(Gunler.PER�EMBE));
		System.out.println(g.ordinal());
		System.out.println(Gunler.PAZAR.ordinal());

	}

}
