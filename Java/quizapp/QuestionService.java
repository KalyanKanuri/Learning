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
        Scanner sc = new Scanner(System.in);
        for(QuestionContainer q : qc) {
            System.out.println(q.getId() +": " +q.getQuestion());
            for(String s : q.getOptions()) {
                System.out.println(s);
            }
            System.out.println("\n----------------------------------------");
            answers[i] = sc.nextLine();
            System.out.println("-----------------------------------------");
            i++;
        }
        sc.close();
    }

    public void validateAnswers() {
        System.out.println("Correct Answers are: \n");
        int score = 0;
        for(int i = 0; i < qc.length; i++) {
            QuestionContainer q = qc[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = answers[i];
            System.out.println(q.getId() +": " +q.getQuestion());
            System.out.println(q.getAnswer());
            if(actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("\nYour score is " +score);
        System.out.println("Thank you for playing the quiz");
    }
}

