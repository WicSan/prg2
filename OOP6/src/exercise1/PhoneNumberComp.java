/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Comparator;

/**
 *
 * @author sandr
 */
public class PhoneNumberComp implements Comparator<AddressEntry> {

    @Override
    public int compare(AddressEntry o1, AddressEntry o2) {
        if(o1 == o2)
            return 0;
        
        return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
    }
}
