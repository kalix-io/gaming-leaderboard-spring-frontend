package com.kalix.leaderboard.demo.pojo;

import java.util.List;

import com.kalix.leaderboard.demo.pojo.PlayerScore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "scores"
})
public class Scores {
    @JsonProperty("scores")
    private List<PlayerScore> scores = null;

    @JsonProperty("scores")
    public List<PlayerScore> getScores() {
        return scores;
    }

    @JsonProperty("scores")
    public void setScores(List<PlayerScore> scores) {
        this.scores = scores;
    }
}