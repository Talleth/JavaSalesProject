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
public class Supplies extends Account {
    
    private int m_numberOfItems;
    
    // Main constructor
    public Supplies(){
        this.m_price = 5.99;
    }
    
    // Override Calculate Price
    public double CalculatePrice(){
        return Math.round(this.m_numberOfItems * this.m_price);
    }
    
    // Override toString
    public String toString(){
        return "Account: " + this.m_accountId + " - Price: " + String.valueOf(this.CalculatePrice());
    }
    
    // Getters and setters
    public int numberOfItems(){
        return this.m_numberOfItems;
    }
    
    public void setNumberOfItems(int numberOfHours){
        this.m_numberOfItems = numberOfHours;
    }
    
}
