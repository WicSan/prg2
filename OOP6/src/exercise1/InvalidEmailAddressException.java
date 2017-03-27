/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author sandr
 */
public class InvalidEmailAddressException extends RuntimeException {
    public InvalidEmailAddressException(String s){
        super(s);
    }
}
