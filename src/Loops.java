
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.a A while loop that prints all even numbers from 0 to 100
		System.out.println("Question 5a -----");
		int x = 0;
		while (x <= 100) {
		System.out.println(x);
		x = x+2;
		}
		System.out.println("Question 5.b----------");		
	 
		//5.b A while loop that prints every 3rd number going backwards from 100 until we reach 0
		int y = 100;
		while (y >= 0) {
		System.out.println(y);
		y = y-3;
		}
		System.out.println("Question 5.c-----");
		
		//5.c A for loop that prints every other number from 1 to 100
		for (int z = 1; z <= 100; z += 2) {
		System.out.println(z);	
		}
		System.out.println("Question 5.d-----");
		
		//5.d A for loop that prints every number from 0 to 100, 
		//but if the number is divisible by 3, it prints “Hello” instead of the number, 
		//and if the number is divisible by 5, it prints “World” instead of the number, 
		//and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		for (int i = 0; i <= 100; i++) {
			if ((i%3 ==0) && (i%5 == 0)) {
				System.out.println("HelloWorld"); 
			}
			else if (i%5 == 0) {
				System.out.println("World");
			}
			else if (i%3 == 0) {
				System.out.println("Hello");
			}
			else {
				System.out.println(i);
			}
		}
	
	}

}
