package theBasics;

public class Assignment2 {

	public static void main(String[] args) {
		//This will be an assignment on loops and logic
		
		//#1
		for(int x = 0; x < 100; x++) {
			x = 99;
			//How many times x will be written to the console?
			//Can you tell me why it will be that number?
			System.out.print(x + "\n");
		}
		
		//#2
		//Write a for loop that starts at 1 and ends at 100.
		//Inside the loop I want you to print if x is an even or odd number.
		//To do that you can use the % known as the mod operator.
		//I don't remember if we talked about this but the mod operator will return the remainder of the division.
		//ex: 25 % 5 = 0, 28 % 5 = 3, 34 % 5 = 4, etc
		//This assignment was also meant for you to ask questions. So it might seem hard.
		
		//Note these next two will fail with the provided x and y. so you can change and x and y to test.
		//#3
		//Write an if statement that will do something if x is divisible by 3 and divisblie by 9.
		//Test cases: x = 27 should do something, 9 should do something, 3 should not, 5 should not
		int x = 3;
		
		//#4
		//Write and if statement that will do something if y is divisible by x.
		//Test cases: x = 3, y = 15 should do something; x = 10, y = 50 should do something; x = 23, y = 50 should not
		int y = 10;
	}
}
