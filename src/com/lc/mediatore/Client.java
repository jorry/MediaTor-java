package com.lc.mediatore;

public class Client {

	public static void main(String[] args) {
		Mediatore m = new ConverMediator();

		TopClass top = new TopClass(m);
		CenterClass center = new CenterClass(m);

		ButtomClass buttom = new ButtomClass(m);

		m.setButtom(buttom);
		m.setCenter(center);
		m.setTop(top);
		center.setList(new String[] { "1", "2", "3", "4", "5" });
		top.eventDeleteV();
		center.list.clear();
		System.out.println("----------分割线");
		center.setList(new String[] {});
		System.out.println("--------------分割线");
		center.clearAll();
		System.out.println("--------------分割线");
		m.intStatus(2);
	}
}
