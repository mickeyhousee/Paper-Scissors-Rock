package PPT;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	
		
		int escolhadouser;
		User escolhauser = new User();
		escolhadouser=escolhauser.escolhauser();
		
		int escolhaDoPc ;
		PC escolhapc =new PC();
		escolhaDoPc=escolhapc.escolhapc();
		
		int escolhafinal;
		Escolha decisao = new Escolha();
		System.out.println(escolhafinal=decisao.decisao(escolhadouser, escolhaDoPc));
	}

}
