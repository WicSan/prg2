package exercise1;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Einfaches Modell einer Adresse. In diesem Beispiel sollen der Namen und
 * Vorname bereits eindeutig sein und den Primärschlüssel darstellen.
 */
public final class AddressEntry implements Comparable<AddressEntry> {

    private final String givenName;
    private final String familyName;
    private String zipCode;
    private String residence;
    private String phoneNumber;
    private String emailAddress;

    /**
     * Konstruktor für Adresse.
     *
     * @param givenName Vorname.
     * @param familyName Nachname.
     */
    public AddressEntry(final String givenName, final String familyName) throws IllegalArgumentException {

        // Prüfung der Werte implementieren!
        if (givenName == null) {
            throw new IllegalArgumentException("Vorname nicht leer");
        } else if (containsNumbers(givenName)) {
            throw new IllegalArgumentException("Vorname keine Zahlen");
        } else if (givenName.length() > 20) {
            throw new IllegalArgumentException("Vorname zu lange");
        }

        if (givenName == null) {
            throw new IllegalArgumentException("Nachname nicht leer");
        } else if (containsNumbers(givenName)) {
            throw new IllegalArgumentException("Nachname keine Zahlen");
        } else if (givenName.length() > 20) {
            throw new IllegalArgumentException("Nachname zu lange");
        }

        this.givenName = givenName;
        this.familyName = familyName;
    }

    public AddressEntry(final String givenName, final String familyName, String zipCode, String eMail, String phoneNumber) throws Exception {
        this(givenName, familyName);

        setZipCode(zipCode);

        setEmailAddress(eMail);

        setPhoneNumber(phoneNumber);
    }

    /**
     * Setzt die Postleitzahl. Muss vierstellig sein.
     *
     * @param zipCode Postleitzahl
     */
    public void setZipCode(final String zipCode) throws IllegalArgumentException {

        // Implementieren!
        // z.B. throw new IllegalArgumentException(zipCode + " is not a Swiss PLZ");
        if (zipCode.length() != 4) {
            throw new IllegalArgumentException(zipCode + " is not a Swiss PLZ");
        } else {
            this.zipCode = zipCode;
        }
    }

    /**
     * Setzt den Wohnort.
     *
     * @param residence Wohnort.
     */
    public void setResidence(final String residence) throws IllegalArgumentException {

        // Implementieren!
        if (residence == null || containsNumbers(residence)) {
            throw new IllegalArgumentException("Wohnort ist falsch");
        }

        this.residence = residence;
    }

    /**
     * Setzt die Telefonnummer.
     *
     * @param phoneNumber Telefonnummer.
     */
    public void setPhoneNumber(final String phoneNumber) throws IllegalArgumentException {

        // Implementieren!
        if (phoneNumber == null || !isPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Telefonnummer ist falsch");
        }

        this.phoneNumber = phoneNumber;
    }

    /**
     * Setzt die EMail-Adresse. Muss ein 'at' enthalten, sonst wird
     * InvalidEmailException geworfen.
     *
     * @param eMailAdresse EMailadresse.
     */
    public void setEmailAddress(final String eMailAdresse) throws InvalidEmailAddressException {

        // Implementieren!
        if (eMailAdresse == null || !isEMail(eMailAdresse)) {
            throw new InvalidEmailAddressException("");
        }

        this.emailAddress = eMailAdresse;
    }

    /**
     * Liefert den Vorname.
     *
     * @return the givenName.
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Liefert den Nachnamen.
     *
     * @return the familyName.
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Liefert die Postleitzahl.
     *
     * @return the zipCode.
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Liefert den Wohnort.
     *
     * @return the residence.
     */
    public String getResidence() {
        return residence;
    }

    /**
     * Liefert die Telefonnummer.
     *
     * @return the phoneNumber.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Liefert die EMail-Adresse.
     *
     * @return the emailAddress.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    private boolean containsNumbers(String s) {
        Pattern p = Pattern.compile(".*\\d.*");
        // Pattern for the numbers 0..9
        return p.matcher(s).find();
    }

    private boolean isPhoneNumber(String s) {
        Pattern p = Pattern.compile("(\\+41){0,1}[\\d]{9,10}");
        // Pattern for the numbers 0..9
        return (s.length() >= 10 && s.length() <= 13) ? p.matcher(s.replace("-", "")).find() : false;
    }

    private boolean isEMail(String s) {
        Pattern p = Pattern.compile("([a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+)");
        // Pattern for the numbers 0..9
        return p.matcher(s).find();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AddressEntry[" + this.familyName + ", " + this.givenName + ", " + this.phoneNumber + "]";
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof AddressEntry)) {
            return false;
        }

        final AddressEntry otherAddress = (AddressEntry) other;
        return Objects.equals(this.getGivenName(), otherAddress.getGivenName())
                && Objects.equals(this.getFamilyName(), otherAddress.getFamilyName())
                && Objects.equals(this.getZipCode(), otherAddress.getZipCode());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getFamilyName(), this.getGivenName(), this.getZipCode());
    }

    @Override
    public int compareTo(AddressEntry other) {
        if (this == other || this.equals(other)) {
            return 0;
        }

        if (this.getFamilyName().equals(other.getFamilyName())) {
            if (this.getGivenName().equals(other.getGivenName())) {
                return this.getZipCode().compareTo(other.getZipCode());
            }

            return this.getGivenName().compareTo(other.getGivenName());
        }

        return this.getFamilyName().compareTo(other.getFamilyName());
    }
}
