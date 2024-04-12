package com.example.multicurrency;

import com.example.multicurrency.MultiCurrency.Money;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MultiCurrencyTest {

    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);
        assertThat(Money.dollar(5)).isEqualTo(five);
        assertThat(Money.franc(5)).isNotEqualTo(five);

    }
}