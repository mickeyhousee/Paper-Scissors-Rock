package PPT;
import java.util.Random;

public class PC {


	public int escolhapc() {
		
		Random  r = new Random();
		int result = r.nextInt(3);
		return result;
	}
	
}
