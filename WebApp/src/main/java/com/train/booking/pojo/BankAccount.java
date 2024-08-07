/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.pojo;

/**
 *
 * @author dell2
 */
public class BankAccount {
private int actNumber;
private double actBalance;

    public int getActNumber() {
        return actNumber;
    }

    public double getActBalance() {
        return actBalance;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public void setActBalance(double actBalance) {
        this.actBalance = actBalance;
    }

public void deposit(double amt)
{
  actBalance= actBalance+amt;

}
public void withdraw(double amt)
{
  actBalance= actBalance-amt;

}
public void checkBalance()
{
    System.out.println("Balance "+actBalance);

}

    @Override
    public String toString() {
        return "BankAccount{" + "actNumber=" + actNumber + ", actBalance=" + actBalance + '}';
    }
    

}
