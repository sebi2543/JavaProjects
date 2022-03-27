package main.java.ro.sci.domain;

public interface Behavior {

    void seeOperationSystem();

    void seeHours();

    void addContact( Contact contact );

    void seeContacts();

     void sendMessage( Contact contact, String text );

    void seeMessage( Contact receiver );

    void makeCall( Contact contact );

    void seeHistory();

}
