package IteratorMode;

import java.sql.Date;

public class IteratorModeDemo {
	public static void main(String[] args) {
		SaleVolumesRepository saleVolumesRepository=new SaleVolumesRepository();
		PraiseRepositary praiseRepositary=new PraiseRepositary();
		TimeRepository timeRepository =new TimeRepository();
		for(Iterator iter1=saleVolumesRepository.getIterator();iter1.hasNext();) {
			int saleVolumes=(int)iter1.next();
			System.out.println("saleVolumes:"+saleVolumes);
		}
		for(Iterator iter2=praiseRepositary.getIterator();iter2.hasNext();) {
			int Praise=(int)iter2.next();
			System.out.println("Praise:"+Praise);
		}
		for(Iterator iter3=timeRepository.getIterator();iter3.hasNext();) {
			Date time=(Date)iter3.next();
			System.out.println("time:"+time);
		}
	}
}
