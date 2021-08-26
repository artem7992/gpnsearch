package com.mayhem.gpnsearch.model;

public class Okved {

    private final int code;
    private final String name;

    public Okved(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Okved { code = " + code + "; name = " + name + " }";
    }

}
