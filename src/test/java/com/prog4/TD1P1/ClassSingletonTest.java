package com.prog4.TD1P1;

import com.prog4.TD1P1.ClassSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClassSingletonTest {
    ClassSingleton classSingleton1 = ClassSingleton.getInstance("Hello world");

    @Test
    void class_singleton_test() {
        assertEquals(classSingleton1.getDescription(), "Hello world");
    }
}
