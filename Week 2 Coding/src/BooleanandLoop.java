
public class BooleanandLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" ");
		System.out.println("1");
		System.out.println(" ");
		
		//1.	What do each of the following Boolean expressions evaluate to?

		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0) == 'h');
		
		System.out.println(" ");
		System.out.println("2a");
		System.out.println(" ");
		
		//2.	In Eclipse, create the following Boolean variables and choose what values they hold:
			//a.	isHotOutside
		
			boolean isHotOutside = true;
					System.out.println(isHotOutside);
					
		System.out.println(" ");
		System.out.println("2b");
		System.out.println(" ");
					
					
			//b.	isWeekday
					
			boolean isWeekday = false;
					System.out.println(isWeekday);
					
		System.out.println(" ");
		System.out.println("2c");
		System.out.println(" ");
	
			//c.	hasMoneyInPocket
					
			boolean hasMoneyInPocket = true;
					System.out.println(hasMoneyInPocket);
					
					System.out.println("");
		
		//3.	Create the following variables (not boolean type, choose the best data type for the variable):
					
		System.out.println(" ");
		System.out.println("3a");
		System.out.println(" ");
						
			//a.	costOfMilk
					
			double costOfMilk = 2.99;
					System.out.println(costOfMilk);
					
		System.out.println(" ");
		System.out.println("3b");
		System.out.println(" ");
					
			//b.	moneyInWallet
						
			double moneyInWallet = 45.19;
				System.out.println(moneyInWallet);
				
		System.out.println(" ");
		System.out.println("3c");
		System.out.println(" ");
				
			//c.	thirstLevel (how thirsty you are on a scale of 1-10)?
				
			int thristLevel = 10;
				System.out.println(thristLevel);
				
		//4.	Using the variables you created above and Boolean operators, create variables for the following scenarios:
				
		System.out.println(" ");
		System.out.println("4a");
		System.out.println(" ");
				
			//a.	shouldBuyIcecream – this should be true if it is hot outside and there is money in your pocket
				
			boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
				System.out.println(shouldBuyIceCream);
				
		System.out.println(" ");
		System.out.println("4b");
		System.out.println(" ");
		
			//b.	willGoSwimming – this should be true if it is hot outside and it is not a weekday
				
			boolean willGoSwimming = isHotOutside && isWeekday;
				System.out.println(willGoSwimming);
				
		System.out.println(" ");
		System.out.println("4c");
		System.out.println(" ");
				
			//c.	isAGoodDay – this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
			
			boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
				System.out.println(isAGoodDay);
				
		System.out.println(" ");
		System.out.println("4d");
		System.out.println(" ");
				
			//d.	willBuyMilk – this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk.
			
			boolean willBuyMilk = isHotOutside && thristLevel >=10 && moneyInWallet >= (costOfMilk * 2);
				System.out.println(willBuyMilk);
			
				System.out.println(" ");
				System.out.println("5a");
				System.out.println(" ");
						
				
		//5.	Create a new class called Loops. In the main method of this class, create the following loops 
			//	with any variables you feel are needed:
				
		
			//a.	A while loop that prints all even numbers from 0 to 100
				
				int i = 0;
				while (i <= 100) {
					if (i % 2 == 0)
						System.out.println(i);
					i++;
				}
				
		System.out.println(" ");
		System.out.println("5b");
		System.out.println(" ");
						
			//b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0
		
				int x = 0;
				while (x <= 100) {
					if (x % 3 == 0)
					 System.out.println(100 - x);
				   	x++;
				   	
				}
				
				System.out.println(" ");
				System.out.println("5c");
				System.out.println(" ");
				
			//c.	A for loop that prints every other number from 1 to 100
				
			    for (int a = 1; a < 100; a  += 2) {
			    	System.out.println(a);
				
			}
			    System.out.println(" ");
				System.out.println("5d");
				System.out.println(" ");
			
			//d.	A for loop that prints every number from 0 to 100, but if the number is divisible 
			    //by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it 
			    //prints “World” ins);   
				
				for (int k = 0; k <=100; k++) {
					if (k % 3 == 0) {
						System.out.println("Hello");
					} else if (k % 5 ==0) {
						System.out.println("World");
					} else if (k%3 == k%5) {
						System.out.println("HelloWorld");
					}else {
							System.out.println(k);
						}
					}
				}
				
				
				
				  
				
				
				
					  
	}
	    
	        		  
	        		      
	        		  
	        		  
	        		  
	        		      
	           
	

	
	        
	        	 
	         
	
	        
	        	 
	        	 
	         
	               
	        	          


	        	   
	        	
	         
	

    
    


	


					
				 
			   
				
				
				
				
						//System.out.println(t);
					//System.out.println("Hello" + " " + "World");
				
				
					
			


				   



			    	
			    

   	
					

