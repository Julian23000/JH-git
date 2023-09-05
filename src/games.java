
import java.util.Random;
import java.util.Scanner;
public class games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		Random random = new Random();
		
		int money;
		int round = 1;
		int three = 3;
		int ten = 10;
		int five = 5;
		
		System.out.println("How much do you want to spend?");
		String answer;
		money = in.nextInt();
		in.nextLine();
		do {
		if(money<1) {
			System.out.println("You have no money left! Thank you for playing!");
		}
		else {
		int rn = random.nextInt(10) +1;
		int rn2 = random.nextInt(10) +1;
		int rn3 = random.nextInt(10) +1;
		System.out.print(rn + " " );
		System.out.print(rn2 + " ");
		System.out.println(rn3 + " ");
		
		
		if(rn == 7 && rn2 == 7 && rn3 == 7) {
		money = money - round + ten;	
		System.out.println("You won 10€, your new balance is: " + money);
		}
		else if(rn == 7 && rn2 == 7 || rn == 7 && rn3 == 7 || rn2 == 7 && rn3 == 7) {
			money = money - round + five;
			System.out.println("You won 5€, your new balance is: " + money);
		}
		else if(rn == 7 || rn2 == 7 || rn3 == 7) {
			money = money - round + three;
			System.out.println("You won 3€, your new balance is: " + money);
		}
		else if(rn!= 7 && rn2 != 7 && rn3 != 7) {
			money = money - round;
			System.out.println("You lost, your new balance is: " + money);
		}
		
		}
		if(money>=1) {
		System.out.println("Would you like to continue? (y/n)");	}
		
		else {
			System.out.println("You ran out of money! Better luck next time!");
			break;
		}
		answer = in.nextLine();
		
		
		} while (answer.equals("y"));
		System.out.println("Thank you for playing! Your new balance is: " + money + " €");
		
		
	}
	
}
