package ders06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class zlambdaOrnek {

	static int kareKok(int a,int b) {
		return (int) Math.pow(a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(20,35,63,27,47,82,99);
		System.out.println(l);

		List<Integer> l1 = l.stream().filter(p->p%4<3 || p>25).collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> l2 = l.stream().map(p->p%2==0?p/2:(p+1)/2).collect(Collectors.toList());
		System.out.println(l2);

		List<Integer> l3 = Arrays.asList(2,3,6,7,4,2,9);
		System.out.println(l3);

		Optional<Integer> toplam = l3.stream().reduce((p1,p2)->kareKok(p1, p2));
		System.out.println(toplam.get());



	}

}
