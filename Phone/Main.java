package main.java.ro.sci.domain;

public class Main {

    public static void main(String[] args) {
        Behavior behaviors6 = new SamsungS6("red",4); //create a new phone
        Behavior behaviors7 = new SamsungS7("blue",6);//create a new phone

        Behavior behaviori10 = new Iphone10("white");//create a new phone
        Behavior behaviori11 = new Iphone11("green");//create a new phone


        behaviors6.seeOperationSystem();//display operating system
        behaviors6.seeHours();//see available battery( in hours)
        System.out.println("--------------------------");

        Contact contact1 = new Contact("0757345476","Eusebiu","Morar");//create a new contact
        Contact contact2 = new Contact("0752565850","Marius","Vesa");//create a new contact
        behaviors6.addContact(contact1);//add contact in phone memory
        behaviors6.addContact(contact2);//add contact in phone memory
        behaviors6.seeContacts();
        System.out.println("--------------------------");


        behaviors6.makeCall(contact1);//make a call to contact1
        behaviors6.makeCall(contact2);//make a call to contact2
        behaviors6.seeHistory( );//see history of calls/

        System.out.println("--------------------------");
        behaviors6.sendMessage(contact1,"Ce mai faci ");//send a message to contact1
        behaviors6.sendMessage(contact2,"Ce ai mai  facut");//send a message to contact1
        behaviors6.seeMessage(contact1);//display the messages sent to contac1

        System.out.println("--------------------------");

        behaviors6.seeHours();



    }
}