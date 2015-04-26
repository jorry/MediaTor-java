package com.lc.mediatore;

import java.util.ArrayList;
import java.util.Arrays;

public class CenterClass extends BaseView {

	ArrayList<String> list = new ArrayList<String>();

	public CenterClass(Mediatore M) {
		super(M);

	}

	public void setList(String a[]) {
		if (a != null) {
			list.addAll(Arrays.asList(a));
			if (list.size() > 1) {
				this.media.isEx = true;
			}
		}
		if (list.isEmpty()) {
			this.media.buttom.changeButtonColor(false);
		} else {
			this.media.buttom.changeButtonColor(true);
		}
	}
	
	public void clearAll(){
		System.out.println("删除全部数据");
		this.list.clear();
		this.media.buttom.changeButtonColor(false);
	}

	public void setVisivleChecked() {
		System.out.println("显示checkBox");
	}

	public void setGoneChecked() {
		System.out.println("隐藏checkBox");
	}

}
