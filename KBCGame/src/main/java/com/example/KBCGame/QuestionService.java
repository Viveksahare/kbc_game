package com.example.KBCGame;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    private final List<Question> questions;

    public QuestionService() {
        questions = new ArrayList<>();
        // Initialize sample questions
        questions.add(new Question("What is the capital of France?", "Paris", List.of("London", "Berlin", "Paris", "Madrid")));
        questions.add(new Question("Which planet is known as the Red Planet?", "Mars", List.of("Earth", "Mars", "Jupiter", "Saturn")));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", "William Shakespeare", List.of("Mark Twain", "Charles Dickens", "William Shakespeare", "Jane Austen")));
        questions.add(new Question("What is the largest ocean on Earth?", "Pacific Ocean", List.of("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean")));
        questions.add(new Question("What is the square root of 64?", "8", List.of("6", "7", "8", "9")));
    }

    public Question getQuestion(int index) {
        if (index < questions.size()) {
            return questions.get(index);
        } else {
            return null; // No more questions
        }
    }
}
