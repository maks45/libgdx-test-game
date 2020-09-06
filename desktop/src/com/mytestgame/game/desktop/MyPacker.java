package com.mytestgame.game.desktop;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class MyPacker {
    public static void main (String[] args) throws Exception {
        TexturePacker.process("/home/maks/AndroidStudioProjects/gdx-test/android/assets/",
                "/home/maks/AndroidStudioProjects/gdx-test/android/assets/",
                "atlas.atlas");
    }
}
