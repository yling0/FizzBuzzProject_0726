package fizzbuzz;

public class Fizzbuzz {
	public static void main(String[] args) {
		
		for (int x=1; x<=100; x++) {
			
			if(x%3==0 && x%15!=0){
				System.out.println("Fizz"); 
			}
			
			else if(x%5==0 && x%15!=0) {
				System.out.println("Buzz");
			}
			
			else if(x%15==0) {
				System.out.println("FizzBuzz");
			}
			
			else {
				System.out.println(x);
			}
		
		} 
		
	}
	
}
