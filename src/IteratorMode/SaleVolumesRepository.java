package IteratorMode;

public class SaleVolumesRepository implements Container{
	public int saleVolume[]= {44,22,224,653};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new SaleVolumesIterator();
	}
	private class SaleVolumesIterator implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			if(index<saleVolume.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return saleVolume[index++];
			}
			return null;
		}
		
	}
	
}
