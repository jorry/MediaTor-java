package com.lc.mediatore;

public abstract class Mediatore {

	public boolean isEx;

	protected TopClass top;

	protected CenterClass center;

	public ButtomClass buttom;

	public TopClass getTop() {
		return top;
	}

	public void setTop(TopClass top) {
		this.top = top;
	}

	public CenterClass getCenter() {
		return center;
	}

	public void setCenter(CenterClass center) {
		this.center = center;
	}

	public ButtomClass getButtom() {
		return buttom;
	}

	public void setButtom(ButtomClass buttom) {
		this.buttom = buttom;
	}

	public abstract void visible();
	public abstract void gone();
	public abstract void change();
	public abstract void intStatus(int status);
}
