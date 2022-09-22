package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("JT-Team"));
    }

    @Test
    public void findLargestNumber() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 2069, 2095"), containsString("2095"));
    }

    // @Test
    // public void findLargestNumber() throws Exception {
    //     assertThat(queryProcessor.process("which of the following numbers%20is%20both%20a%20square%20and%20a%20cube:%20740,%20324"), containsString("2095"));
    // }

}
