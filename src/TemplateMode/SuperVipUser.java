package TemplateMode;

public class SuperVipUser extends ShoppingPayment{
	double price;
	int integral;
	boolean n;
	String commodity;
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
		this.price=price;
		System.out.println("40% off...");
		System.out.println("CalculateTotalPrice...");
		integral=(int)this.price;
		System.out.println("Your integral is:"+integral);
		if(integral>100) {
			this.price=this.price*0.6-integral/100;
			integral=integral%100;
		}else {
			this.price=this.price*0.6;
		}
		
	}

	@Override
	void Payment(String commodity,double price) {
		if(n) {
			this.price=this.price+10;
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
