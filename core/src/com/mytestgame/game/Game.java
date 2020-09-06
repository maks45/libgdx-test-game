package com.mytestgame.game;

import com.badlogic.gdx.Screen;
import com.mytestgame.game.view.GameScreen;

public class Game extends com.badlogic.gdx.Game {
	private Screen gameScreen;

	@Override
	public void create () {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}

	@Override
	public void dispose() {
		super.dispose();
		gameScreen.dispose();
	}
}
