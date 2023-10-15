package HFJ.SerializationAndIO.EFlashcard;

public class QuizCard {
    String q;
    String a;

    QuizCard(String question,String answer){
        this.q = question;
        this.a = answer;
    }

    public String getQuestion() {
        return q;
    }

    public String getAnswer() {
        return a;
    }

}
