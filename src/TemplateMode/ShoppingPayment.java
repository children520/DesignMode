package TemplateMode;

public abstract class ShoppingPayment {
	abstract void LogIn();
	abstract boolean SelectCommodity(String commdoityClass);
	abstract void CalculateTotalPrice(double price);
	abstract void Payment(String commodity,double price);
	abstract void Delivery();
	public final void start(double price,String commodity) {
		if(commodity=="实物商品") {
			LogIn();
			SelectCommodity(commodity);
			CalculateTotalPrice(price);
			Payment(commodity,price);
			Delivery();
		}else {
			LogIn();
			SelectCommodity(commodity);
			CalculateTotalPrice(price);
			Payment(commodity,price);
		}
	}
	
}
