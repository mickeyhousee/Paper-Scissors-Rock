package PPT;
import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);

	public int escolhauser() {
		int escolhauser=0;
		System.out.println("Escolha |tesoura-0|Papel-1|Pedra-2|");
		escolhauser=sc.nextInt();
		
		return escolhauser;
	}
	
}
