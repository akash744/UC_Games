package com.example.ucgames.Models;

public class Game {

    private String gameName, gameRating, gamePublisher, gameDeveloper, gameCategory, gamePrice, gameDescription, headerFilename, iconFileName, gameRsr;
    private int gameID;



    public Game(int gameID, String gameName, String gamePublisher, String gameDeveloper, String gameCategory, String gamePrice, String gameRating, String gameDescription, String iconFileName, String headerFilename, String gameRsr){

        this.gameID = gameID;
        this.gameName = gameName;
        this.gamePublisher = gamePublisher;
        this.gameDeveloper = gameDeveloper;
        this.gameCategory = gameCategory;
        this.gamePrice = gamePrice;
        this.gameRating = gameRating;
        this.gameDescription = gameDescription;
        this.headerFilename = headerFilename;
        this.iconFileName = iconFileName;
        this.gameRsr = gameRsr;

    }

    // Empty constructor!
    public Game(){ }

    public String getGameRsr() {
        return gameRsr;
    }

    public void setGameRsr(String gameRsr) {
        this.gameRsr = gameRsr;
    }
    public String getHeaderFilename(){
        return this.headerFilename;
    }

    public int getGameID(){
        return this.gameID;
    }

    public String getIconFileName(){
        return this.iconFileName;
    }

    public String getGameName(){
        return this.gameName;
    }
    public String getGameRating() {
        return this.gameRating;
    }

    public String getGamePublisher(){
        return this.gamePublisher;
    }

    public String getGameDeveloper(){
        return this.gameDeveloper;
    }

    public String getGameCategory(){
        return this.gameCategory;
    }

    public String getGamePrice(){
        return this.gamePrice;
    }

    public String getGameDescription(){
        return this.gameDescription;
    }




    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGameRating(String gameRating) {
        this.gameRating = gameRating;
    }

    public void setGamePublisher(String gamePublisher) {
        this.gamePublisher = gamePublisher;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public void setGamePrice(String gamePrice) {
        this.gamePrice = gamePrice;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public void setHeaderFilename(String headerFilename) {
        this.headerFilename = headerFilename;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }


}
