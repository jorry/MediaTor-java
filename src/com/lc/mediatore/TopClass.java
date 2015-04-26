package com.lc.mediatore;

public class TopClass extends BaseView{

	public TopClass(Mediatore M) {
		super(M);
	}


	public void eventDeleteV(){
		System.out.println("显示删除按钮");
		if(media.isEx){
			this.media.visible();
		}
	}
	public void eventDeleteGone(){
		System.out.println("隐藏删除按钮");
		this.media.gone();
	}


	public void goneDelete() {
		System.out.println("初始化隐藏删除按钮");
	}
	
}
