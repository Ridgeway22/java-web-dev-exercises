package Quiz;

import java.util.ArrayList;

public class TrueFalse extends Question  {
    private ArrayList<String> answersToPresent = new ArrayList<String>();

    public void TrueFalse(String prompt, String correctAnswer, ArrayList<String> answersToPresent){
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
        answersToPresent.add(0, "true");
        answersToPresent.add(1, "false");

    }
}
