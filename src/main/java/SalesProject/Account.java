/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesProject;

/**
 *
 * @author lonst
 */
public abstract class Account {
    
    // Hidden member variables
    protected int m_accountId;
    protected double m_price;
    
    public Account(){
    }
   
    // Force sub classes to implement
    abstract double CalculatePrice();
    
    // Getters and setters
    public int getAccountId(){
        return this.m_accountId;
    }
    
    public void setAccountId(int accountId){
        this.m_accountId = accountId;
    }
}
