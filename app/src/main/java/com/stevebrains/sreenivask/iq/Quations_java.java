package com.stevebrains.sreenivask.iq;

public class Quations_java{
    private int QNo;
    private String Question;
    private String Answer;
    private String getQuaNo;

    public Quations_java(int QNo, String Question, String Answer, String getQuaNo) {
        this.QNo = QNo;
        this.Question = Question;
        this.Answer = Answer;
        this.getQuaNo = getQuaNo;

    }

    public int getId() {
        return QNo;
    }

    public String getQuestion() {
        return Question;
    }

    public String getAnswer() {
        return Answer;
    }

    public String getQuaNo() {
        return getQuaNo;
    }



}
