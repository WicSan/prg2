package exercise1;

import java.util.Optional;

/**
 * Einfache Client-Anwendung für Adressbook..
 */
public final class DemoAddressBookClient {

    private final AddressBook addressBook = new AddressBook();

    /**
     * Privater Konstruktor.
     */
    private DemoAddressBookClient() {
        final AddressEntry muster = new AddressEntry("Hans", "Muster");
        
        try {           
            muster.setZipCode("6048");
            muster.setResidence("Horw");
            muster.setPhoneNumber("+41413391111");
            muster.setEmailAddress("Hans.Muster@info.com");
            System.out.println(muster);
            this.addressBook.insertEntry(muster);
        } catch(Exception e){
            System.out.println(e.toString());
        }

        final AddressEntry demo = new AddressEntry("Heiri", "Demo");
            
        try {
            demo.setZipCode("1234");
            demo.setResidence("Weissnidwo");
            demo.setPhoneNumber("+1111");
            demo.setEmailAddress("dont@reply.com");
            System.out.println(demo);
            this.addressBook.insertEntry(demo);
            this.addressBook.insertEntry(muster);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Addressbuch hat " + this.addressBook.getEntryCount() + " Einträge.");

        final Optional<AddressEntry> optEntry = this.addressBook.findByName("Hans", "Muster");
        if (optEntry.isPresent()) {
            System.out.println("Eintrag gefunden: " + optEntry.get());
        } else {
            System.out.println("Eintrag nicht gefunden.");
        }
        
        addressBook.sort();
        addressBook.print();

        try {
            this.addressBook.removeEntry(muster);
            System.out.println("Addressbuch hat " + this.addressBook.getEntryCount() + " Einträge.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * main für Demo.
     * @param args nicht verwendet.
     */
    @SuppressWarnings("unused")
    public static void main(final String[] args) {
        new DemoAddressBookClient();
    }
}
