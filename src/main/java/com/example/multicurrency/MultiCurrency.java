package com.example.multicurrency;

public class MultiCurrency {
    static class Money{
        private int amount;
        private String currency;

        public Money(int amount, String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        public static Money dollar(int amount){
            return new Money(amount, "USD");
        }
        public static Money franc(int amount){
            return new Money(amount, "CHF");
        }

        public String currency(){
            return this.currency;
        }
        @Override
        public boolean equals(Object o){
            Money money = (Money) o;
            return money.amount==this.amount&&this.currency()== money.currency();
        }
    }
}
