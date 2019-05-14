package ge.edu.freeuni.rsr.individual.game.entity;


import com.google.gson.annotations.SerializedName;

public class Question {
    @SerializedName("id")
    int id;
    @SerializedName("question_content")
    String questionContent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
