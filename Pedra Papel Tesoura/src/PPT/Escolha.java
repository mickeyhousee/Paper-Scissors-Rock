package PPT;

public class Escolha {

	public int decisao(int escolhauser, int escolhapc){

		int result = 0 ;

		if(escolhauser ==0){
			if (escolhapc ==0){
				System.out.println("EMPATE!");}
			else{
				if (escolhapc ==1){
					System.out.println("GANHOU!");}
				else{
					if (escolhapc==2) System.out.println("PERDEU!");}
			}
		}if (escolhauser ==1){
			if (escolhapc==0){
				System.out.println("PERDEU!");}
			else{
				if (escolhapc==1){
					System.out.println("EMPATE!");}
				else{
					if(escolhapc==2) System.out.println("GANHOU!");}
			}
		}if (escolhauser==2){
			if(escolhapc==0){
				System.out.println("GANHOU!");}
			else{
				if (escolhapc==1){
					System.out.println("PERDEU!");}
				else{
					if(escolhapc==2) System.out.println("EMPATE!!");
				}
			}

		}


		return result;


	}
}