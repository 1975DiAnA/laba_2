package com.company;

public class Node {
    private String word;
    private int value;
    public Node next;

    public Node(String word){
        word = word.trim();
        this.word = word;
        int value = 0;
        for(int i = 0; i < word.length(); i++){
            value += word.charAt(i);
        }
        this.value = value;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
