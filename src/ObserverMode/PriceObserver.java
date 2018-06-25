package ObserverMode;

import java.util.List;
import java.util.ArrayList;

public abstract class PriceObserver {
	protected Subject subject;
	public abstract void PriceUpdate();
}
