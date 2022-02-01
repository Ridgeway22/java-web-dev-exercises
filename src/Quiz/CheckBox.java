package Quiz;

import java.util.ArrayList;

public class CheckBox extends Question {
    private ArrayList<String> answersToPresent = new ArrayList<String>();

    public void CheckBoxs(String prompt, String correctAnswer, ArrayList<String> answersToPresent) {
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
        answersToPresent = answersToPresent;

    }
}
