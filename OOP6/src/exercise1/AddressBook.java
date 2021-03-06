package exercise1;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Einfache Implementation eines Adressbuches.
 */
public final class AddressBook {

    private final List<AddressEntry> addresses;

    /**
     * Konstruktor.
     */
    public AddressBook() {
        addresses = new ArrayList<>();
    }

    /**
     * Fügt einen neuen Eintrag mit Namen in Adressbuch ein.
     * @param givenName Vorname.
     * @param familyName Nachname.
     * @return true wenn eingefügt.
     */
    public boolean insertEntry(final String givenName, final String familyName) throws IllegalArgumentException {
        final AddressEntry entry = new AddressEntry(givenName, familyName);
        return this.addresses.add(entry);
    }

    /**
     * Fügt einen Eintrag in Adressbuch ein.
     * @param address Eintrag.
     * @return true wenn eingefügt.
     */
    public boolean insertEntry(final AddressEntry address) {
        return this.addresses.add(address);
    }

    /**
     * Entfernt einen Eintrag.
     * @param address Adresseintrag.
     * @return true wenn gefunden und entfernt.
     */
    public boolean removeEntry(final AddressEntry address) {
        return this.addresses.remove(address);
    }

    /**
     * Sucht im Adressbuch nach Name.
     * @param givenName Vorname.
     * @param familyName Nachname.
     * @return Eintrag (optional).
     */
    public Optional<AddressEntry> findByName(final String givenName, final String familyName) {
        return this.addresses.stream().filter(entry -> entry.equals(new AddressEntry(givenName, familyName)))
                .findFirst();
    }

    /**
     * Liefert die Anzahl Einträge im Adressbuch.
     * @return Anzahl Einträge.
     */
    public int getEntryCount() {
        return this.addresses.size();
    }
    
    public void sort(){
        addresses.sort(null);
    }
    
    public void sortbyPhonenumber(){
        //addresses.sort(new PhoneNumberComp());
        
        /*Collections.sort(addresses, (AddressEntry o1, AddressEntry o2) -> {
            if(o1 == o2)
                return 0;
            
            return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
        });*/
        
        //addresses.sort(Comparator.comparing(a -> a.getPhoneNumber()));
        addresses.sort(Comparator.comparing(AddressEntry::getPhoneNumber));
    }
    
    public void print(){
        this.addresses.forEach(a -> System.out.println(a.toString()));
    }
}
