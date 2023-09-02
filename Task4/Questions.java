
import java.util.List;

public class Questions {
    private String question;
    private List<String> options;
    public int correctOption;

    public Questions(String questionText, List<String> options, int correctOption) {
        this.question = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
    public Questions()
    {
        this.question = "";
        this.options = null;
        this.correctOption = 0;
    }


    public String getQuestionText() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int selectedOption) {
        return selectedOption == correctOption;
    }


}
