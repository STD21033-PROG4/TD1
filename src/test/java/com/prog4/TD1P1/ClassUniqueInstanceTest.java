package com.prog4.TD1P1;


import lombok.Data;

@Data
public class ClassUniqueInstanceTest {
    ClassUniqueInstance classUniqueInstance1 = ClassUniqueInstance.INSTANCE.getInstance();

    @Test
    void class_singleton_test() {
        assertEquals(classUniqueInstance1.getClick(),0);
    }

}
