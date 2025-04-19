package io.github.ashokkumarchoppadandi;

import org.junit.jupiter.api.Test;

import java.util.List;

public class UtilityTest {

    @Test
    public void simpleTest() {
        assert true;
    }

    @Test
    public void testGenerateMessagesWhenAnPositiveIntegerIsProvided() {
        Utility utility = new Utility();

        List<String> messages = utility.generateMessages(10);
        int actualMessagesSize = messages.size();
        int expectedMessagesSize = 10;
        assert (expectedMessagesSize == actualMessagesSize);
    }

    /*
    @Test
    public void testGenerateRandomNumber() {
        Utility utility = new Utility();
        utility.setNumber(100);

        int actualRandomNumber = utility.generateRandomNumber();
        assert (100 < actualRandomNumber);
    }
    */
}
