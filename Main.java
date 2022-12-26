import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		
		
		System.out.println("Hello, you have 120 seconds to compute many arithmetic computations");
		System.out.println("Type \"Start\" for begin, or \"Exit\" for Close");
		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		boolean wantToStart = false;
		boolean again;
		do {
			String text = sc.nextLine().toLowerCase();
			if("start".equals(text) ){
					
					 wantToStart = true;
			}	

			else if("exit".equals(text) ) {
				System.exit(0);
			}
	
			else {
				System.out.println("Please type correct command! =_=");
			}
		} while(!wantToStart);
		do{
			 again = false;
			System.out.println(g.gaming());
			System.out.println("Are you want to play again?(Please answer \"Yes\" or \"No\")");
			String text = sc.nextLine().toLowerCase();
			if("yes".equals(text)) again = true;
			else if( !("no".equals(text) ) ) System.out.println("Please type correct command! =_=");

		}while(again);


	}
}
