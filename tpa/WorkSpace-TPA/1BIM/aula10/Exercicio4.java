import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int i=2,f=1;
		
			while(i<=100) {
				f=f+i;
			System.out.println("somat�ria realizada � " +f);
			i++;
		}
		
		in.close();
	}

}
