package ders00;

public class hesapla {
	int a,b;
	
	hesapla(){ //constructer method
		this.a = 5;
		this.b = 5;
	}
	
	hesapla(int a,int b){//constructer� overload ettik
		a = a*2;
		b = b*2;
	}

	int topla(int a, int b) {
		return a + b;
	}
	
	int topla(int a,int b, int c) { //overload method
		return a + b + c;
	}
	
}
