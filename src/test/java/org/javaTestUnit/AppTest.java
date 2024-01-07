package org.javaTestUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void addTwoNumbers(){
        App calculation = new App();
        Integer resultSum = calculation.addition(1, 1);
        Assertions.assertEquals(2, resultSum);
    }
}
