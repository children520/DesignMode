package ObserverMode;

import java.util.List;
import java.util.ArrayList;

public class Subject {
	private List<PriceObserver> priceObservers=new ArrayList<PriceObserver>();
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
		notifyAllPriceObservers();
		
	}
	public void attach(PriceObserver priceObserver) {
		priceObservers.add(priceObserver);
	}
	public void notifyAllPriceObservers() {
		for(PriceObserver priceObserver:priceObservers) {
			priceObserver.PriceUpdate();
		}
	}
}
