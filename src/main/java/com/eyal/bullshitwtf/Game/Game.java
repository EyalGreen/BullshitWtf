package com.eyal.bullshitwtf.Game;

import java.util.ArrayList;

public class Game {
    private String pin;
    private GameProperties gameProperties;
    private ArrayList<Player> players;


    public Game() {
    }

    public Game(String pin, GameProperties gameProperties, ArrayList<Player> players) {
        this.pin = pin;
        this.gameProperties = gameProperties;
        this.players = players;
    }

    public void createNewGame(){

    }
    public void createPin(){

    }

}
