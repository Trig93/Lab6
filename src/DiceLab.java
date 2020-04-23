import java.util.Scanner;

public class DiceLab {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean goNext;
		while(goNext = true){
		System.out.println("Please enter # of sides on first dice:");
		int dice1 = userInput.nextInt();
		System.out.println("Please enter # of sides on second dice:");
		int dice2 = userInput.nextInt();
		System.out.println("Roll em!");
		System.out.println(throwDice1(dice1));
		System.out.println(throwDice2(dice2));
		if(dice1 == 1 && dice2 == 1) {
			System.out.println("Boom, snake eyes!");
			System.out.println("Do you want to continue? yes/no:");
			String yes = userInput.next().toLowerCase();
			if(yes.equals("yes")) {
				goNext = true;
			}else {
				break;
			}
		}else {
			System.out.println("Do you want to continue? yes/no:");
			String yes = userInput.next().toLowerCase();
			if(yes.equals("yes")) {
				goNext = true;
			}else {
				break;
			}
		}
	}
		System.out.println("Thanks for playing!");	
	}
		

	
	private static int throwDice1 (int dice1) {
		return ((int)(Math.random() * dice1 + 1));
					
	}
	private static int throwDice2 (int dice2) {
		return ((int)(Math.random() * dice2 + 1));
	}

}
