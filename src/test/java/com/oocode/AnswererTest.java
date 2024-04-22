package com.oocode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswererTest {
    @Test
    public void canAnswerMyName() {
        var contents = new Answerer().answerFor("What is your name?");

        assertThat(contents, equalTo("Hello World"));
    }

    @Test
    public void canAnswerMyAge() {
        var contents = new Answerer().answerFor("What is your age?");

        assertThat(contents, equalTo("42"));
    }
}