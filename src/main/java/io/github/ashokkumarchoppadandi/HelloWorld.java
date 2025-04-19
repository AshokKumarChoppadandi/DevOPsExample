package io.github.ashokkumarchoppadandi;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        Utility utility = new Utility();
        utility.setNumber(number);

        int result1 = utility.generateRandomNumber();
        System.out.println("Result1 - " + result1);

        List<String> messages = utility.generateMessages(number);
        for(String message: messages) {
            System.out.println("Message - " + message);
        }

    }
}
