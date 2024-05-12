package quizapp;

public class Main {
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        qs.playQuiz();
        qs.validateAnswers();
    }
}
