package edu.jsu.mcis;

import java.util.*;

public class Hangman {
    public enum Result { WIN, LOSE, NONE };
    private String word;
    private List<Character> usedLetters;
    
    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public boolean available(char c) {
        return true;
    }
    
    public int guess(char c) {
        return 2;
    }
    
    public Result getResult() {
        return Result.NONE;
    }
    
}












