package com.mygdx.game.vue.vue_carte;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class LiveObjectClickListener extends GlobalClickListener {

    private LiveObjectActor actor;

    public LiveObjectClickListener(LiveObjectActor actor) {
        this.actor = actor;
    }

    @Override
    public void clicked(InputEvent event, float x, float y) {
        System.out.println(actor.liveObject + " has been clicked.");
        if 
    }
}
