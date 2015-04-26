package com.lc.mediatore;

public abstract class BaseView {

	Mediatore media;
	public BaseView(Mediatore M ){
		this.media = M;
	}
}
