package com.oocode;

import java.util.Objects;

public class Answerer {
    public String answerFor(String question) {
        if (question.equals("What is your Name?")) {
            return answerName();
        }
        else if (question.equals("What is your Age?")) {
            return answerAge();
        }
        return "Wrong Question!";
    }

    public String answerName() {
        return "Hello World";
    }

    public String answerAge() {
        return "42";
    }
}
