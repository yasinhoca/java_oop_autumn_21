package ders04;

public class thrad {
	static int i,j;

	public static void main(String[] args) {
		// Thread 	
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(i=0;i<10000;i++) {
					System.out.print("A");
				}				
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(j=0;j<10000;j++) {
					System.out.print("B");
				}
			}
		});
		
		t1.start();
		t2.start();	
		

	}

}
