import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int count = 0;
    public Quiz(int numOfQuestions) {
        questions = new Question[numOfQuestions];
    }
    public void addQuestion(Question q) {
        if(count < questions.length) {
            questions[count] = q;
            count++;
        }
    }
    public void giveQuiz() {
        Scanner s = new Scanner(System.in);
        int amountOfQuestions = 0;
        for(Question q : questions) {
            System.out.println("Question " + (amountOfQuestions + 1));
            System.out.println("====================");
            System.out.println(q.getQuestion());
            System.out.print("Enter answer (case insensitive). For true or false, use [T/F]: ");
            String input = s.nextLine().toUpperCase();
            q.answerCorrect(input);
            amountOfQuestions++;
        }
    }
}
