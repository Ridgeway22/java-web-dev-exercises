package Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
   Scanner input = new Scanner(System.in);
   ArrayList<Question> questions = new ArrayList<Question>();
   ArrayList<String> answers = new ArrayList<String>();

   private void GenerateQuestions(){
       questions.add(new CheckBox("What are types of drinks", "Water, Milk, Beer", new ArrayList<String>(Arrays.asList("milk, beer, soda, lemonade"))));
       questions.add(new TrueFalse("Is the sky blue?", "true", new ArrayList<String>(Arrays.asList())));
       questions.add(new MultipleChoice("Which of these are orange?", "orange", new ArrayList<String>(Arrays.asList("orange, bagels, sandwhich"))))
   }

    private String GetUserInput (){
        return input.nextLine();

    }
    public void run() {
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).DisplayQuestion();
            answers.add(GetUserInput());
        }
    }

    public double calculateGrade() {
        double numCorrect = 0;
        double numTotal = questions.size();
        for (int i = 0; i < questions.size(); i++) {
            if (answers.get(i).equals( questions.get(i).correctAnswer)) {
                numCorrect++;
            }
        }
return (numCorrect/numTotal) *100;

    }
}
