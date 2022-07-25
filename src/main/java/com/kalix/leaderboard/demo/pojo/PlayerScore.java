package com.kalix.leaderboard.demo.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(        {
        "playerId",
        "playerName",
        "playerScore"
        })
public class PlayerScore {
    @JsonProperty("playerId")
    private String playerId;
    @JsonProperty("playerName")
    private String playerName;
    @JsonProperty("playerScore")
    private String playerScore;

    @JsonProperty("playerId")
    public String getPlayerId() {
        return playerId;
    }
    @JsonProperty("playerId")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("playerName")
    public String getPlayerName() {
        return playerName;
    }
    @JsonProperty("playerName")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("playerScore")
    public String getPlayerScore() {
        return playerScore;
    }
    @JsonProperty("playerScore")
    public void setPlayerScore(String playerScore) {
        this.playerScore = playerScore;
    }
}