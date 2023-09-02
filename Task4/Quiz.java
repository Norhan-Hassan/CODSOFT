import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {
    final List<Questions> questions;
    private int score;
    private int currentQuestionIndex;
    private Timer timer;
    private final int questionDurationInSeconds = 10;

    public Quiz(List<Questions> questions) {
        this.questions = questions;
        this.score = 0;
        this.currentQuestionIndex = 0;
    }

    public void start() {
        displayQuestion();
    }

    public void displayQuestion()
    {
        if (currentQuestionIndex < questions.size())
        {
            Questions question = questions.get(currentQuestionIndex);
            System.out.println(question.getQuestionText());

            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++)
            {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            timer = new Timer();
            timer.schedule(new TimerTask()
            {
                @Override
                public void run() {
                    handleTimeout();
                }
            }, questionDurationInSeconds * 1000);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice (1-" + options.size() + "): ");
            int userChoice = scanner.nextInt();

            // Cancel the timer because the user responded
            timer.cancel();

            if (question.isCorrect(userChoice))
            {
                System.out.println("Correct!\n");
                score++;
            }
            else
            {
                System.out.println("Incorrect"+"\n");
            }

            currentQuestionIndex++;
            displayQuestion();
        }
        else
        {

            displayResult();
        }
    }

    public void handleTimeout() {
        System.out.println("Time's up!\n");
        currentQuestionIndex++;
        // Move to the next question
         displayQuestion();
    }

    public void displayResult() {
        System.out.println("Quiz completed!. Your score: " + score + "/" + questions.size());
    }


}
