package com.lc.mediatore;

public class ButtomClass extends BaseView{

	public ButtomClass(Mediatore m) {
		super(m);
	}

	public void setVisibleButton() {
		System.out.println("显示底部按钮");
	}

	public void setGoneButton() {
		System.out.println("隐藏底部按钮");
	}

	public void changeButtonColor(boolean b) {
		System.out.println("变色咯"+b);
	}
	
	public void goneButtom(){
		System.out.println("初始化隐藏底部按钮");
	}

}
