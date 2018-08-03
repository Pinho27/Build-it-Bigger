package com.example.joketeller;


import java.util.Random;

public class JokeDispenser {

    public String getJoke(){

        String[] jokes = {"Anton, do you think I’m a bad mother?\n" +
                "\n" +
                "My name is Paul.\n",
                "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.\n",
                "What is the difference between a snowman and a snowwoman?\n" +
                        "-\n" +
                        "Snowballs."
        };

        return jokes[new Random().nextInt(jokes.length)];
    }
}
