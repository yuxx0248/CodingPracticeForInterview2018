package com.example.codingPractice;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class blackRock3 {

    private static final String TEXT = "I am a {0} account with {1,number,#} units of {2} currency";

    public void main( String args[] ) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add( new SavingsAccount( "USD", 3 ) );//Savings
        accounts.add( new SavingsAccount( "EUR", 2 ) );//Savings
        accounts.add( new CheckingAccount( "HUF", 100 ) );//Checking
        accounts.add( new CheckingAccount( "COP", 10000 ) );//Checking
        accounts.add( new BrokerageAccount( "GBP", 2 ) );//Brokerage
        accounts.add( new BrokerageAccount( "INR", 600 ) );//Brokerage

        accounts.stream().forEach(
                account -> System.out.println(
                        MessageFormat.format( TEXT,
                                new Object[]{
                                        account.getAccountType().getName(),//make this work
                                        account.getUnits(),//make this work
                                        account.getCurrency()//make this work
                                } ) ) );
    }

    public class BankAccount {
        public String currency;
        public int num;

        public BankAccount() {
        }

        public int getUnits() {
            return num;
        }

        public String getCurrency() {
            return currency;
        }

        public Class<? extends BankAccount> getAccountType() {
            return getClass();
        }
    }

    public class SavingsAccount extends BankAccount {

        public SavingsAccount( String accountName, int num ) {
            this.currency = accountName;
            this.num = num;
        }

    }

    public class CheckingAccount extends BankAccount {

        public CheckingAccount( String accountName, int num ) {
            this.currency = accountName;
            this.num = num;
        }

    }

    public class BrokerageAccount extends BankAccount {

        public BrokerageAccount( String accountName, int num ) {
            this.currency = accountName;
            this.num = num;
        }

    }
}
