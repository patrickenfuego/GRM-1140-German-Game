package com.germanproject.accessors;

public class Question
{
    private String answerA, answerB, answerC, answerD;
    private String correctAnswer;
    private boolean correctSelected;

    public Question(String answerA, String answerB, String answerC, String answerD, String correctAnswer)
    {
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }
    //setters
    public void setAnswerA(String answerA)
    {
        this.answerA = answerA;
    }
    public void setAnswerB(String answerB)
    {
        this.answerB = answerB;
    }
    public void setAnswerC(String answerC)
    {
        this.answerC = answerC;
    }
    public void setAnswerD(String answerD)
    {
        this.answerD = answerD;
    }
    public void setCorrectAnswer(String correctAnswer)
    {
        this.correctAnswer = correctAnswer;
    }
    public void setCorrectSelected(boolean correctSelected)
    {
        this.correctSelected = correctSelected;
    }
    //getters
    public String getAnswerA()
    {
        return answerA;
    }
    public String getAnswerB()
    {
        return answerB;
    }
    public String getAnswerC()
    {
        return answerC;
    }
    public String getAnswerD()
    {
        return answerD;
    }
    public String getCorrectAnswer()
    {
        return correctAnswer;
    }
    public boolean isCorrectSelected()
    {
        return correctSelected;
    }

    @Override
    public String toString()
    {
        return "Question{" +
                "answerA='" + answerA + '\'' +
                ", answerB='" + answerB + '\'' +
                ", answerC='" + answerC + '\'' +
                ", answerD='" + answerD + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", correctSelected=" + correctSelected +
                '}';
    }
}
