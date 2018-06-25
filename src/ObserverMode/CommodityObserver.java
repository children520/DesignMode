package ObserverMode;

public class CommodityObserver extends PriceObserver{
	@Override
	public void PriceUpdate() {
		System.out.println("the price is "+subject.getPrice());
	}
	public CommodityObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
}
