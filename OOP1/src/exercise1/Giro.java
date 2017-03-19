package exercise1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sandr
 */
public class Giro extends Konto{
    private final double creditLimit;
    private final double creditRate;
    
    public Giro(double s, double r){
        super(s, r);
        
        creditLimit = -1000;
        creditRate = 10.0;
    }
    
    @Override
    public void payOut(double value){
        if(getSaldo() - value > creditLimit){
            super.payOut(value);
        }
        else{
            System.out.println("Sie haben eine Kreditlimite von " + creditLimit);
        }
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Kreditlimite: " + creditLimit);
        System.out.println("Kreditlimite: " + creditRate);
    }
}
