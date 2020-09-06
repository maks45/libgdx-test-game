package com.mytestgame.game.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Polygon;
import com.mytestgame.game.view.GameScreen;

public class CarController {
    private Polygon carBounds;
    private int carMoveSpeed;

    public CarController(Polygon carBounds) {
        this.carBounds = carBounds;
        this.carMoveSpeed  = 0;
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                if (screenX > Gdx.graphics.getWidth() / 2){
                    setSliceSpeed(++carMoveSpeed);
                } else {
                    setSliceSpeed(--carMoveSpeed);
                }
                return super.touchDown(screenX, screenY, pointer, button);
            }
        });
    }

    public void handle() {
        System.out.println("carPositionX: " + carBounds.getX());
        //setCarBoundsPosition(carBounds.getX() + carMoveSpeed * GameScreen.deltaCff);
        carBounds.setPosition(carBounds.getX() + carMoveSpeed * GameScreen.deltaCff, carBounds.getY());
        /*carBounds.setPosition(carBounds.getX() + MathUtils.cosDeg(carBounds.getRotation() + 90) * carSpeed * GameScreen.deltaCff,
                carBounds.getY() + MathUtils.sinDeg(carBounds.getRotation() + 90) * carSpeed * GameScreen.deltaCff);*/
    }

    private void setSliceSpeed(float carSpeed) {
        if(carSpeed > 3) {
            carMoveSpeed = 3;
        } else if(carSpeed < -3) {
            carMoveSpeed = -3;
        }
    }


}
