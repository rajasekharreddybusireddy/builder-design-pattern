package com.example.com;

public class BuilderDesignpattern {
    public static void main(String[] args) {
        User user = new User.UserBuilder("raja", "reddy")
                .address("hyderabad")
                .build();
        System.out.println(user);

    }
}
