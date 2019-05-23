package com.mygdx.game.vue.vue_liveobject;

import java.awt.Color;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.mygdx.game.model.LiveObject;
import com.mygdx.game.vue.vue_carte.TiledMapClickListener;

public class LiveObjectActor extends Actor {

    LiveObject liveObject;

    Sprite sprite;

    public LiveObjectActor(LiveObject liveObject) {
        this.liveObject = liveObject;
        sprite = new Sprite(new Texture(Gdx.files.internal("Tiles/character.png")));
        EventListener eventListener = new LiveObjectClickListener(this);
        addListener(eventListener);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        setBounds(liveObject.getX()*sprite.getHeight(), liveObject.getY()*sprite.getHeight(), sprite.getWidth(), sprite.getHeight());
        batch.draw(sprite, liveObject.getX()*sprite.getWidth(), liveObject.getY()*sprite.getHeight());
    }
    
    /** Cette méthode permettra de set le sprite correspondant à l'objet. 
     * Onregardera donc quelle est l'instance de cette objet (soldat, hdv, caserne...) afin 
     * de lui donner la bonne apparence. 
	*/
    public void setSprite() {
    	switch(this.liveObject.getClass().getName()) {
    	case "com.mygdx.game.model.HotelDeVille" :
    		if(this.liveObject.getJoueur().getCouleur() == Color.blue) {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("HVBleu.png")));
    		} else {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("HVRouge.png")));
    		}
    		break;
    	case "com.mygdx.game.model.Caserne" : /* -------------PAS ENCORE DE SKIN PORU CASERNE --------*/
    		if(this.liveObject.getJoueur().getCouleur() == Color.blue) {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("HVBleu.png")));
    		} else {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("HVRouge.png")));
    		}
    		break;
    	case "com.mygdx.game.model.Soldat" :
    		if(this.liveObject.getJoueur().getCouleur() == Color.blue) {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("SoldatBleu.png")));
    		} else {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("SoldatRouge.png")));
    		}
    		break;
    	case "com.mygdx.game.model.Archer" : /* -------------PAS ENCORE DE SKIN PPUR ARCHER --------*/
    		if(this.liveObject.getJoueur().getCouleur() == Color.blue) {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("SoldatBleu.png")));
    		} else {
    			this.sprite = new Sprite(new Texture(Gdx.files.internal("SoldatRouge.png")));
    		}
    		break;
    /* AFFICHAGE DES RESSOURCES -> NE SONT PAS DES LIVE OBJECT */
    	
    	}

    } 
    
}
