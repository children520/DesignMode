package IteratorMode;

import java.sql.Date;

public class TimeRepository implements Container{
	Date t1=new Date(100000000);
	Date t2=new Date(200000000);
	Date t3=new Date(300000000);
	Date t4=new Date(400000000);
	
	public Date Time[] = {t1,t2,t3,t4};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new TimeIterator();
	}
	private class TimeIterator implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			if(index<Time.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return Time[index++];
			}
			return null;
		}
		
	}

}
