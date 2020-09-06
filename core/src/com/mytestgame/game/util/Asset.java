package com.mytestgame.game.util;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Asset {
    private AssetManager assetManager;


    public Asset() {
        assetManager = new AssetManager();
        assetManager.load("atlas.atlas", TextureAtlas.class);
        assetManager.finishLoading();
    }

    public AssetManager getAssetManager() {
        return assetManager;
    }

    public void dispose(){
        assetManager.dispose();
    }
}
