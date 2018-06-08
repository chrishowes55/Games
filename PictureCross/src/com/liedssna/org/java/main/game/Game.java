package com.liedssna.org.java.main.game;

import com.liedssna.org.java.main.display.Display;

public class Game {
	
	private Display display;
	
	public Game() {
		display = new Display("Picture Cross");
		display.setVisible(true);
	}

}
