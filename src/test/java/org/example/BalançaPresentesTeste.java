package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class BalançaPresentesTeste {
    @Test
    @DisplayName("Should be possible balance the gifts of weights 4,6,2 in the sleigh")
    public void ShouldBePossibleBalanceTheGiftsOfWeights46Or2(){
        int[] pesos = {4,6,2};
        assertEquals("S", Balanca.Equilibrou(pesos));
    }



}
