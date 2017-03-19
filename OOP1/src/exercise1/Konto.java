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
public class Konto {
    
    private int no;
    private static int count = 0;
    private double saldo;
    private double rate;
    
    public Konto(){
        no = count;
        count ++;
        saldo = 0;
        rate = 0;
    }
    
    public Konto(double s, double r){
        this();
        saldo = s;
        rate = r;
    }

    public final void payIn(final double value){
        if(value > 0.0){
            saldo += value;
        }
    }
    
    public void payOut(final double value){
        if(value > 0.0 && this.saldo >= value){
            saldo -= value;
        }
    }
    
    public void print(){
        System.out.println("------");
        System.out.println("Kontonummer: " + no);
        System.out.println("Saldo: " + saldo);
        System.out.println("Zins: " + rate);
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    public String toString(){
        String s = "Kontonummer: " + no + System.getProperty("line.separator");
        s += "Saldo: " + saldo + System.getProperty("line.separator");
        s += "Zins: " + rate;
        return s;
    }
}
