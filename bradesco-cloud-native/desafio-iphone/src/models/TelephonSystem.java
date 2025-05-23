package models;

public interface TelephonSystem {
    public void aceptCall();

    public void selectContact(String nameContact, int contactNumber);

    public void callContact();

    public void closeCall();
    
}
