package com.kalix.leaderboard.demo.pojo;

public class Player {

    private String playerId;
    private String leaderBoardId;
    private String playerName;
    private String playerScore;

    public String getPlayerId() {
        return playerId;
    }
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerScore() {
        return playerScore;
    }
    public void setPlayerScore(String playerScore) {
        this.playerScore = playerScore;
    }

    public String getLeaderBoardId() {
        return leaderBoardId;
    }
    public void setLeaderBoardId(String leaderBoardId) {
        this.leaderBoardId = leaderBoardId;
    }
}
