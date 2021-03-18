package com.company;

public class ReadyPlayer {
    private static int id;
    private String fullname;
    private String username;
    private String subscriptionType;
    private String playerTier;
    private int readyCoins;
    private int eliteCoins;
    private int gamePoints;

    public ReadyPlayer(String fullname, String username) {
        this.fullname = fullname;
        this.username = usernameCreator(username);

        ReadyPlayer();
    }

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPlayerTier() {
        return playerTier;
    }

    public int getReadyCoins() {
        return readyCoins;
    }

    public int getEliteCoins() {
        return eliteCoins;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPlayerTier(String playerTier) {
        this.playerTier = playerTier;
    }

    public void setReadyCoins(int readyCoins) {
        this.readyCoins = readyCoins;
    }

    public void setEliteCoins(int eliteCoins) {
        this.eliteCoins = eliteCoins;
    }

    public String usernameCreator(String username)
    {
        return "@"+username;
    }

    public void setUsername(String username) {this.username = username;}

    public void showInfo()
    {
        System.out.println("Fullname: " + this.fullname);
        System.out.println("Username: " + this.username);
        System.out.println("Player Tier: " + playerTierTracker() + " " +this.gamePoints);
        System.out.println("Ready Coins: " + this.readyCoins);
        System.out.println("Elite Coins: " + this.eliteCoins);
    }

    public int buyEliteCoins(int eliteCoins)
    {
        if (this.subscriptionType == "Elite Subscription")
        {
            setEliteCoins(eliteCoins + this.eliteCoins);
        }
        else
        {
            System.out.println("You need to have Elite Subscription to buy elite coins");
        }

        return 0;
    }

    public void ReadyPlayer()
    {
        this.gamePoints = 0;
        this.readyCoins = 0;
        this.eliteCoins = 0;
        this.playerTier = playerTierTracker();
    }

    public String playerTierTracker()
    {
        if(this.gamePoints < 0)
        {
            this.gamePoints = 0;
        }
        else if (this.gamePoints >= 0 && this.gamePoints <= 999)
        {
            return "Bronze";
        }
        else if (this.gamePoints >= 1000 && this.gamePoints <= 1999)
        {
            return "Silver";
        }
        else if (this.gamePoints >= 2000 && this.gamePoints <= 2999)
        {
            return "Gold";
        }
        else if (this.gamePoints >= 3000 && this.gamePoints <= 3999)
        {
            return "Diamond";
        }
        else if (this.gamePoints >= 4000)
        {
            return "Platinum";
        }

        return "false";
    }
}