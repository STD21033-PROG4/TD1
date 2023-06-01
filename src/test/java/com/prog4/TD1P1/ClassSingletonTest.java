package com.prog4.TD1P1;

import com.prog4.TD1P1.ClassSingleton;


public class ClassSingletonTest {
    ClassSingleton classSingleton1 = ClassSingleton.getInstance("Hello world");

    @Test
    void class_singleton_test() {
        assertEquals(classSingleton1.getDescription(), "Hello world");
    }
}
