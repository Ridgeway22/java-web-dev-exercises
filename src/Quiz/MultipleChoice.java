package Quiz;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    public void addQuestion(String prompt, String correctAnswer, ArrayList<String> answersToPresent) {
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
    }
}