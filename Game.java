import java.util.Scanner;
class Game {
	Scanner scanner = new Scanner(System.in);
	RandomOps rgame = new RandomOps();
	long StartTime = System.currentTimeMillis();
	int score,falseAnswers;
	///
	boolean timeOut() {
		if((System.currentTimeMillis() - StartTime) / 1000 >=120)
			return true;

		else
			return false;
	}



	public String gaming() {
		while(!timeOut() ){
			// System.out.println();//Go to new Line
			String[] params = rgame.next();//get next operation with her answer
			System.out.print(params[0]); //print operation 
			Integer answer;//for answer checking

			do {//try to parse typed in keyboard
				try {
					 answer = Integer.parseInt(scanner.nextLine() );
					break;
				}
				catch(Exception e) {
					System.out.println("Please type correct number! =_=");
				}
			}while(true);

			if(params[1].equals(answer.toString())) { 
				score++; 
				// System.out.print(" OK");
			}
			else {
				falseAnswers++;
				System.out.println("Wrong");
			}
		}
		System.out.println("Time Out!!!");
		System.out.println("Thank you for your time");
		String result = "Number of questions:\t" + (score + falseAnswers) + 
						 "\nYour score:\t" + score +
						 "\nWrong answers:\t" + falseAnswers;
		return result;
	}	
}				