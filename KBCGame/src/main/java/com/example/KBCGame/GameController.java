package com.example.KBCGame;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/game")
public class GameController {private final QuestionService questionService;
    private Map<String, String> playerAnswers = new HashMap<>();

    public GameController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/question/{index}")
    public Question getQuestion(@PathVariable int index) {
        return questionService.getQuestion(index);
    }

    @PostMapping("/submit")
    public String submitAnswer(@RequestParam String answer, @RequestParam int questionIndex, @RequestParam String playerName) {
        Question question = questionService.getQuestion(questionIndex);
        if (question == null) {
            return "No more questions available!";
        }

        String correctAnswer = question.getCorrectAnswer();
        if (answer.equals(correctAnswer)) {
            playerAnswers.put(playerName, "Congratulations " + playerName + "! Your answer is correct.");
            return playerAnswers.get(playerName);
        } else {
            return "Wrong answer, " + playerName + ". Please try again!";
        }
    }
}
