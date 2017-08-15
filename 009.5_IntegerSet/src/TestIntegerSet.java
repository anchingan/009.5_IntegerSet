/*
 * Practice 009.2_Integer set
 * Date 20170811
 */

import java.util.Scanner;

public class TestIntegerSet {
	static IntegerSet[] sets = new IntegerSet[2];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Create array to store input integerSet.
		// sets[0]:set A, sets[1]:set B;
		
		System.out.print("Initial size for Set A: ");
		int input = scanner.nextInt();
		sets[0] = new IntegerSet(input);
		System.out.print("Initial size for Set B: ");
		input = scanner.nextInt();
		sets[1] = new IntegerSet(input);
		int setNum = -1, status = 0;
		IntegerSet c = new IntegerSet();
		do {
			switch(status) {
			case 0:
				System.out.print("Menu: 1) Modify A. 2) Modify B. 3) Intersection. 4) Union. -1) Quit:");
				input = scanner.nextInt();
				status = doMenuOption(input);
				break;
				
			case 1:
				setNum = (input - 1);
				char[] printSet = {'A','B'};
				System.out.printf("Modify %c: a) Insert. b) Output. c) Delete. d) Back: ", printSet[setNum]);
				modify(setNum);
				status = 0;
				break;
				
			//Intersection.	
			case 2: 
				c = sets[0].intersection(sets[1]);
				
				System.out.print("Intersection: ");
				c.output();
				
				status = 0;
				break;
				
			//Union.
			case 3:
				c = sets[0].union(sets[1]);
				
				System.out.print("Union: ");
				c.output();
				
				status = 0;
				break;
			}
		} while (status != -1);
		
		System.out.print("Programe terminate!");
	}
	
	private static int doMenuOption(int input) {
		if (input == 1 || input == 2)
			return 1;
		else if (input == 3)
			return 2;
		else if (input == 4)
			return 3;
		else if (input == -1)
			return -1;
		else {
			System.out.println("Input error!");
			return 0;
		}
	}

	private static void modify(int setNum) {
		String inputC = scanner.nextLine();
		inputC = scanner.nextLine();
		int input;
		if (inputC.equalsIgnoreCase("a") == true) {
			System.out.print("Insert:");
			input = scanner.nextInt();
			sets[setNum].insert(input);
		}
		else if (inputC.equalsIgnoreCase("b") == true) 
			sets[setNum].output();
		else if (inputC.equalsIgnoreCase("c") == true) {
			System.out.print("Delete:");
			input = scanner.nextInt();
			sets[setNum].delete(input);
		}
		else
			;
	}
}

