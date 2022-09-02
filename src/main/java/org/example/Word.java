package org.example;

public class Word {
    private String name; //멤버변수&디폴트
    private String meaning;

    public String getName() {
        return name;
    }

    public Word() {
    }

    public Word(String name) {
        this.name = name;
    }

    public Word(String name, String meaning) {
        this.name = name;
        this.meaning = meaning;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
