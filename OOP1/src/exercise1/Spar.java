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
public class Spar extends Konto{
    private final double maxOut;
    
    public Spar(double s, double r){
        super(s, r);
        maxOut = 60;
    }
    
    @Override
    public void payOut(double value){
        if(value <= maxOut){
            super.payOut(value);
        }
        else{
            System.out.println("Es können maximal " + maxOut + " abgehoben werden.");
        }
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Maximale Auszahlung: " + maxOut);
    }
}
