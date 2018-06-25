package TemplateMode;

public class TemplateModeDemo {
	public static void main(String[] args) {
		ShoppingPayment normalUser=new NormalIUser();
		ShoppingPayment vipUser=new VipUser();
		ShoppingPayment superVipUser=new SuperVipUser();
		System.out.println("普通用户。。。");
		normalUser.start(100,"电子商品");
		System.out.println("会员用户。。。");
		vipUser.start(200,"实物商品");
		System.out.println("vip用户。。。");
		superVipUser.start(100,"电子商品");
	}
	
}
