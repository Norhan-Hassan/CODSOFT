import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Questions> questions = new ArrayList<>();
        questions.add(new Questions("What is 2 + 2?", Arrays.asList("3", "4", "5"), 2));
        questions.add(new Questions("Which planet is known as the Red Planet?",Arrays.asList("Earth", "Mars", "Jupiter"), 2));
        questions.add(new Questions("What is the capital of Egypt?",Arrays.asList("Berlin", "London", "Cairo"), 3));
        questions.add(new Questions("Predict the output of following Java program.\n" +
                "class Test { \n" +
                "    public static void main(String[] args) { \n" +
                "      for(int i = 0; 0; i++) \n" +
                "      { \n" +
                "          System.out.println(\"Hello\"); \n" +
                "          break; \n" +
                "      } \n" +
                "    } \n" +
                "} ",Arrays.asList("Cross Hello" , "Empty Output" , "Tick" , "Compiler error" , "Runtime error"), 4));
        questions.add(new Questions("class Main {   \n" +
                "   public static void main(String args[]) {      \n" +
                "         int t;      \n" +
                "         System.out.println(t); \n" +
                "    }   \n" +
                "}",Arrays.asList("0" , "garbage value" , "compiler error" , "runtime error"), 3));

        // Create and start the quiz
        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}