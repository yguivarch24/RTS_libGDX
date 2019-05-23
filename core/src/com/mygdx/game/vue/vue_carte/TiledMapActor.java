package com.mygdx.game.vue.vue_carte;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.model.ComposantCarte;
import com.mygdx.game.model.Foret;
import com.mygdx.game.model.Plaine;
import com.mygdx.game.model.GisementOr;
import com.mygdx.game.model.Buisson;

public class TiledMapActor extends Actor {

    TiledMap tiledMap;

    TiledMapTileLayer tiledLayer;

    ComposantCarte cellule;

    public TiledMapActor(TiledMap tiledMap, TiledMapTileLayer tiledLayer, int x, int y) {
        this.tiledMap = tiledMap;
        this.tiledLayer = tiledLayer;
        System.out.println(tiledLayer.getCell(x, y).getTile().getId());
        switch (tiledLayer.getCell(x, y).getTile().getId()) {
            case 257 : 
            	cellule = new Foret(x,y);
            	break;
            case 260 : 
            	cellule = new GisementOr(x,y);
            	break;
            case 262 : 
            	cellule = new Buisson(x,y);
            	break;
            default: 
            	cellule = new Plaine(x, y);
            	break;
        }
    }
}
