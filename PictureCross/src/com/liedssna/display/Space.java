package com.liedssna.display;

import javax.swing.JLabel;

public class Space extends JLabel {
	
	private boolean shouldBe;
	private boolean black;
	
	public Space(boolean shouldBe) {
		this.shouldBe = shouldBe;
		this.black = false;
	}

	public boolean isShouldBe() {
		return shouldBe;
	}
	
	public void setBlack(boolean b) {
		black = b;
	}
	
	public boolean getBlack() {
		return this.black;
	}

}
