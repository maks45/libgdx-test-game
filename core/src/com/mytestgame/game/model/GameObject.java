package com.mytestgame.game.model;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Polygon;


public abstract class GameObject {
    protected Polygon bounds;
    protected Sprite sprite;

    public GameObject(TextureRegion textureRegion, float x, float y, float width, float height) {
        sprite = new Sprite(textureRegion);
        sprite.setSize(width, height);
        sprite.setOriginCenter();
        sprite.setPosition(x, y);
        bounds = new Polygon(new float[]{0, 0, width, 0, height, width, height, 0});
        bounds.setPosition(x, y);
        bounds.setOrigin(width /2f, height/2f);

    }

    public void draw(SpriteBatch batch) {
        sprite.setPosition(bounds.getX(), bounds.getY());
        sprite.setRotation(bounds.getRotation());
        sprite.draw(batch);
    }

    private Polygon getBounds(){
        return bounds;
    }
}
