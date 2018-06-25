package TemplateMode;

public class NormalIUser extends ShoppingPayment{
	boolean n;
	double price;
	@Override
	void LogIn() {
		System.out.println("Login...");
	}

	@Override
	boolean SelectCommodity(String commodity) {
		System.out.println("SelectCommodity...");
				
		if(commodity=="电子商品") {
			n=false;
			System.out.println("Your commodity is 电子商品");
		}else {
			n=true;
			System.out.println("Your commodity is 实物商品");

		}
		return n;
	}

	@Override
	void CalculateTotalPrice(double price) {
		
		System.out.println("No discount...");
		System.out.println("CalculateTotalPrice...");
		this.price=price;
	}

	@Override
	void Payment(String commodity,double price) {
		if(n) {
			System.out.println("The total price is:"+this.price+10);
			System.out.println("Payment...");
		}else {
			System.out.println("The total price is:"+this.price);
			System.out.println("Payment...");

		}
	}

	@Override
	void Delivery() {
		System.out.println("Delivery...");
	}

}
