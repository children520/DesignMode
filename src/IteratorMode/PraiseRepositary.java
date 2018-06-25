package IteratorMode;

public class PraiseRepositary implements Container{
	public int PraiseNumbers[]= {78,23,55,32};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new PraiseIterator();
	}
	private class PraiseIterator implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			if(index<PraiseNumbers.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return PraiseNumbers[index++];
			}
			return null;
		}
		
	}

}
