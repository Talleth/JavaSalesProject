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
public class Services extends Account {
    
    private int m_numberOfHours;
    
    // Main constructor
    public Services(){
        this.m_price = 100;
    }
    
    // Override Calculate Price
    public double CalculatePrice(){
        return this.m_numberOfHours * this.m_price;
    }
    
    // Override toString
    public String toString(){
        return "Account: " + this.m_accountId + " - Price: " + String.valueOf(this.CalculatePrice());
    }
    
    // Getters and setters
    public int numberOfHours(){
        return this.m_numberOfHours;
    }
    
    public void setNumberOfHours(int numberOfHours){
        this.m_numberOfHours = numberOfHours;
    }
    
}
