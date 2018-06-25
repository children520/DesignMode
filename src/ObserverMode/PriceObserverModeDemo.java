package ObserverMode;

public class PriceObserverModeDemo {
	public static void main(String[] args) {
		Subject subject=new Subject();
		new CommodityObserver(subject);
		
		subject.setPrice(10);
		
		subject.setPrice(15);
	}
}
