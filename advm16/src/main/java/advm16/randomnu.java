package advm16;

import java.util.Random;

public class randomnu {
	/**
	 * the below method is used to generate random numbers
	 * @return
	 */
		public int getRandonNumber() {
			Random random= new Random();
			int ranNum = random.nextInt(1000);
			return ranNum;
		}
}
