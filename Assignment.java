
public class Assignment {

static double getDiscountAfterPromoCode(int code, double amount){
		
		double discount = 0.0;
		
		if(code == 1){
			if(amount>1000){
				discount = amount*(50.0/100.0);
			}
			else if(amount<1000 && amount>500) {
	    		System.out.println("Code not Applied But you can choose Code 2 ");
	    	}
			else if(amount<500 &&amount>200) {
	    		System.out.println("Code not Applied But you can choose Code 3 ");
	    	}
	    }else if(code == 2){
	    	if(amount>1000){
	    		System.out.println("You Can Have Better Code i.e. 1 For Following Amount ");
	    		
	    	}
	    	else if(amount<1000 && amount>500) {
	    		discount = amount*(30.0/100.0);
	    	}
	    	else if(amount<500 &&amount>200) {
	    		System.out.println("Code not Applied But you can choose Code 3 ");
	    	}
	    	
	    }else if(code == 3 ){
	    	if(amount>1000){
	    		System.out.println("You Can Have Better Code i.e. 1 For Following Amount ");
	    		
	    	}
	    	else if(amount<1000 && amount>500) {
	    		System.out.println("You Can Have Better Code i.e. 2 For Following Amount ");
	    	}
	    	else if(amount<500 &&amount>200) {
	    		discount = amount*(30.0/100.0);
	    		
	    	}
	    	
	    	
		}
			else {
				if(code!=1 || code!=2 || code!=3){
					System.out.println("Please apply code");
					if(amount>1000){
						System.out.println("You can apply code 1");
					}
					else if(amount<1000 && amount>500) {
			    		System.out.println("You can apply code 2 ");
			    	}
					else if(amount<500 &&amount>200) {
			    		System.out.println("You can apply code 3 ");
			    	}
				}
				else {
					System.out.println("We Cannot Offer Discounts For Amount Less Than 200");
				}
	    		
	    	}
		
		
		return discount;
	}

	
	public static void main(String[] args) {
		
		// 1: Flat50 | 2: Flat30 | 3: Flat10
		
				double total = 300;
				//MethodsDemo.applyPromoCode(2, total);
				
				double disc = Assignment.getDiscountAfterPromoCode(3, total);
				System.out.println(">> Please Now Pay: \u20b9"+(total - disc));
				
		
		
		
	}

}
