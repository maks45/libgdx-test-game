package com.mytestgame.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.mytestgame.game.model.Car;
import com.mytestgame.game.util.Asset;

public class GameScreen implements Screen {
    public static float deltaCff;
    private SpriteBatch batch;
    private Car car;
    private OrthographicCamera orthographicCamera;
    private Asset asset;

    @Override
    public void show() {
        batch = new SpriteBatch();
        asset = new Asset();
        car = new Car(asset.getAssetManager().get("atlas.atlas", TextureAtlas.class)
                .findRegion("car_top_view"),
                0f,0f, 5f, 5f );
    }

    @Override
    public void render(float delta) {
        deltaCff = delta;
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(orthographicCamera.projection);
        batch.begin();
        car.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        float aspectRatio = (float) height / width;
        orthographicCamera = new OrthographicCamera(50f , 50f * aspectRatio);
        orthographicCamera.update();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        asset.dispose();
        batch.dispose();
    }
}
