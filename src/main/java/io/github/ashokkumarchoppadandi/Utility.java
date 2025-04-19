package io.github.ashokkumarchoppadandi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utility {
    private int number;

    public Utility() {
    }

    public Utility(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(20) + number;
    }

    public List<String> generateMessages(int num) {
        List<String> messages = new ArrayList<>();
        for(int i = 1; i <= num; i++) {
            messages.add("Hello World - " + i);
        }
        return messages;
    }

    @Override
    public String toString() {
        return "Utility{" +
                "number=" + number +
                '}';
    }
}
