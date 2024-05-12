package quizapp;


import java.util.Scanner;

public class QuestionService {
    QuestionContainer[] qc = new QuestionContainer[3];
    String[] answers = new String[3];

    public QuestionService() {
        String[] options1 = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
        String[] options2 = {"Hyderabad", "Warangal", "Kolkata", "Chennai"};
        String[] options3 = {"Footballer", "Wrestler", "Fighter", "Alien"};
        qc[0] = new QuestionContainer(1,"What is the capital of India? ", options1, "Delhi");
        qc[1] = new QuestionContainer(2, "What is the capital of Telangana? ", options2, "Hyderabad");
        qc[2] = new QuestionContainer(3, "Who is Messi? ", options3, "Footballer");
    }

    public void playQuiz() {
        System.out.println("Welcome to Quiz App");
        System.out.println("Please answer the following questions");
        System.out.println("-------------------------------------------");

        int i = 0;
        for(QuestionContainer q : qc) {
            System.out.println(q.getId() +": " +q.getQuestion());
            for(String s : q.getOptions()) {
                System.out.println(s +"\n");
            }
            Scanner sc = new Scanner(System.in);
            answers[i] = sc.nextLine();
            i++;
        }
    }

    public void validateAnswers() {
        int score = 0;
        for(int i = 0; i < qc.length; i++) {
            QuestionContainer q = qc[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = answers[i];

            if(actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is " +score);
    }
}

