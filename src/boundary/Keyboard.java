package boundary;

import java.util.Scanner;

public class Keyboard {
	private Scanner in;
	public Keyboard() {
		in = new Scanner(System.in);
	}

	public void waitForInt(int ind){
		int temp;
			do {
			temp = in.nextInt();
			}while (!(ind==temp)); 
	}
	
	public void waitForEnter(){
		in.nextLine();
	}
}
