package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface ComposantCarte {

	final int TILESize = 64;

	/** Obtenir l'état d'une case pour les LiveObject (occupée/vide) */
	public boolean estOccupee();
	
	/** Définir un LiveObject sur ce composant de carte */
	public void setLiveObject(LiveObject object);
	
	/** Retourne le LiveObject sur l'environnement */
	public LiveObject getLiveObject();

}