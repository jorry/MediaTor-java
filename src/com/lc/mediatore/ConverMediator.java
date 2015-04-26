package com.lc.mediatore;

public class ConverMediator extends Mediatore {

	public void intStatus(int status) {
		switch (status) {
		case 1:
			
			break;
		case 2:
			this.top.goneDelete();
			this.buttom.goneButtom();
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}

	@Override
	public void change() {
		if (isEx) {
			this.buttom.changeButtonColor(true);
		} else {
			this.buttom.changeButtonColor(false);
		}

	}

	@Override
	public void visible() {
		if (isEx) {
			this.center.setVisivleChecked();
			this.buttom.setVisibleButton();
		}
	}

	@Override
	public void gone() {
		if (isEx) {
			this.center.setGoneChecked();
			this.buttom.setGoneButton();
		}
	}
}
