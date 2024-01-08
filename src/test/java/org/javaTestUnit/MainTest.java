package org.javaTestUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void addTwoNumbers(){
        Main calculation = new Main();
        Integer resultAddition = calculation.addition(1, 1);
        Assertions.assertEquals(2, resultAddition);
    }

}
