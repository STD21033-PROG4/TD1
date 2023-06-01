package com.prog4.TD1P1;


import lombok.Data;

@Data
public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String description;

    private ClassSingleton(String description) {
        this.description = description;
    }

    public static ClassSingleton getInstance(String text) {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton(text);
        }

        return INSTANCE;
    }
}
