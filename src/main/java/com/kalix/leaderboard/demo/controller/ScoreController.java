package com.kalix.leaderboard.demo.controller;

import com.kalix.leaderboard.demo.pojo.Player;
import com.kalix.leaderboard.demo.pojo.Scores;
import okhttp3.*;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Controller
public class ScoreController {
    @GetMapping("/addScore")
    public String showForm(Model model) {
        Player newPlayer = new Player();
        model.addAttribute("playerDetails", newPlayer);
        return "addScore.html";
    }

    @PostMapping("/save")
    public String saveDetails(@ModelAttribute("playerDetails") Player ourPlayerDetails) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        String leaderBoardID = ourPlayerDetails.getLeaderBoardId();
        String playerID = ourPlayerDetails.getPlayerId();
        String playerName = ourPlayerDetails.getPlayerName();
        String playerScore = ourPlayerDetails.getPlayerScore();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("player_id", playerID);
        jsonObject.put("player_name", playerName);
        jsonObject.put("player_score", playerScore);
        String jsonData = String.valueOf(jsonObject);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(jsonData, mediaType);
        Request request = new Request.Builder()
                .url("http://localhost:8080/player/" + leaderBoardID + "/add")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        client.newCall(request).execute();
        return "redirect:/leaderboard";
    }

    @GetMapping("/leaderboard")
    public String showScores(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        //the leaderboard id to be changed dynamically in your code
        Scores responseList = restTemplate.getForObject("http://localhost:8080/44/list", Scores.class);

        model.addAttribute("scoreList", responseList.getScores());
        return "leaderboard.html";
    }
}