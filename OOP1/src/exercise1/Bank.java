package exercise1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import exercise2.Iterator;
import exercise2.LinkedList;

/**
 *
 * @author sandr
 */
public class Bank {

    private final String name;
    private final LinkedList<Konto> accountList;
    
    public Bank(String n){
        name = n;
        accountList = new LinkedList<>();
    }
    
    public void openKonto(double saldo, double rate){
        Konto k = new Konto(saldo, rate);
        accountList.insert(k);
    }
    
    public void openSpar(double saldo, double rate){
        Spar s = new Spar(saldo, rate);
        accountList.insert(s);
    }
    
    public void openGiro(double saldo, double rate){
        Giro g = new Giro(saldo, rate);
        accountList.insert(g);
    }
    
    public int noOfAccounts(){
        return accountList.length();
    }
    
    public void printAccounts(){       
        Iterator<Konto> it = accountList.iterator();
        
        while(it.hasNext()){
            Konto k = it.next();
            k.print();
        }
        
        //accountList.print();
    }
    
    public void printFund(){
        double sum = 0;

        Iterator<Konto> it = accountList.iterator();
        
        while(it.hasNext()){
            Konto k = it.next();
            sum += k.getSaldo();
        }
        
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bank b = new Bank("test");
        b.openGiro(400, 0.5);
        b.openSpar(300, 0.5);
        b.openKonto(60, 0.5);
        b.printFund();
        b.printAccounts();
    }
}
