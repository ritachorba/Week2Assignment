
public class wk2code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//what do boolean expressions evaluate to?
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false||true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5>= 4 && 1 > 3);
		System.out.println(10<4 ||1>4);
		System.out.println(12>=2 &&1<24);
		System.out.println("Hello".charAt(0)== 'h');
		
		//boolean and other variables
		boolean isHotOutside = true;
		boolean isWeekday = true; 
		boolean hasMoneyInPocket = true;
		double costOfMilk = 3;
		double moneyInWallet = 5;
		int thirstLevel = 8;
		boolean isSummer = true;
		
		//shouldByIcecream – is hot outside and there is money in your pocket
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		
		//willGoSwimming – is hot outside and it is not a weekday
		boolean willGoSwimming = isHotOutside && !isWeekday;
		
		//isAGoodDay – is hot outside, there is money in your pocket, and it is not a weekday
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		
		//willBuyMilk –is hot, and thirst greater/equal 3, and money greater/equal 2 times milk
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (2*costOfMilk));	
	}

}
