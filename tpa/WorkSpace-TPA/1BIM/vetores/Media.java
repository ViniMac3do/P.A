package vetores;

import java.util.Scanner;

public class Media {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int []a= new int[10];
	int b =0;
	for (int i = 0; i < a.length; i++) {
		System.out.println("Digite o valor de numero "+i+"�");
		a[i]= in.nextInt();
		b+=a[i];
	}
	System.out.println("A media da vetor � de: "+(b/10));
	in.close();
}
}
