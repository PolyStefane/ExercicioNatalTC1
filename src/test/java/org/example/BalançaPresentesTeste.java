package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class BalançaPresentesTeste {
    @Test
    @DisplayName("Should be possible balance the gifts of weights 4,6,2 in the sleigh")
    public void ShouldBePossibleBalanceTheGiftsOfWeights46And2(){
        int[] pesos = {4,6,2};
        assertEquals("S", Balanca.Equilibrou(pesos));
    }

    @Test
    @DisplayName("Should be possible balance the gifts of weights 6,6 in the sleigh")
    public void ShouldBePossibleBalanceTheGiftsOfWeights6And6(){
        int[] pesos = {6,6};
        assertEquals("N", Balanca.Equilibrou(pesos));
    }

    @Test
    @DisplayName("Should balance the gifts with a exactly difference of 5 kg")
    public void ShouldBalanceTheGiftsExactlyDifferenceOf5(){
        int[] pesos = {3,8};
        assertEquals("S", Balanca.Equilibrou(pesos));
    }

    @Test
    @DisplayName("Should balance with equal weights 2, 2, 2, 2")
    public void ShouldBalanceWithEqualWeights22and2(){
        int[] pesos = {2,2,2,2};
        assertEquals("S", Balanca.Equilibrou(pesos));
    }

}
