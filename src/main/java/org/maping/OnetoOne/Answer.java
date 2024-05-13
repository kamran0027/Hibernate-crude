package org.maping.OnetoOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    private int answerid;

    private  String answer;

    public Answer(int answerid, String answer) {
        this.answerid = answerid;
        this.answer = answer;
    }

    public Answer() {

    }

    public int getAnswerid() {
        return answerid;
    }

    public void setAnswerid(int answerid) {
        this.answerid = answerid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
