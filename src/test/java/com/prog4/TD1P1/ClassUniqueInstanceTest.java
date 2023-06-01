package com.prog4.TD1P1;


import lombok.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Data
public class ClassUniqueInstanceTest {
    ClassUniqueInstance classUniqueInstance1 = ClassUniqueInstance.INSTANCE.getInstance();

    @Test
    void class_singleton_test() {
        assertEquals(classUniqueInstance1.getClick(),0);
    }

}
