package com.gbabler.msusers.enumeration;

public enum Gender {

    MASCULINO("male"), FEMININO("female");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}