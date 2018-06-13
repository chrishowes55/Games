package com.liedssna.game;

import com.liedssna.display.Display;

public class Game {
	
	private Display display;
	
	public Game() {
		display = new Display("Picture Cross", this);
		display.setVisible(true);
	}
	
	public boolean check() {
		for(int i = 0; i < display.getSpaces().size(); i++) {
			if (display.getSpaces().get(i).isShouldBe() != display.getSpaces().get(i).getBlack()) {
				return false;
			}
		}
		return true;
	}

}
