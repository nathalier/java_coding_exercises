package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        return (double) Math.round(originalPrice * (1 + vatRate / 100) * 100) / 100;
    }

    public String reverse(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        return sb.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (User user: users) {
            if (user.getType().equals("Linux")) {
                count++;
            }
        }
        return count;
    }
}
