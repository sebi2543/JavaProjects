package main.java.ro.sci.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone  {

    List<Contact> contacts = new ArrayList<>();
    List<Message> messages = new ArrayList<>();
    List<Contact> calls= new ArrayList<>();
    public  void addContact( Contact contact ){
        contacts.add( contact);
}
 /**
   it displays all contacts
  */
    public void seeContacts( ){
        for ( Contact contact : contacts ){
            System.out.println( contact );
        }
    }

/**
it sends a message
@param  contact represents the contact that receives the message ( The receiver)
@param text represents the message that is sent.
 */
    public void sendMessage( Contact contact, String text){
        System.out.println( "The message have been sent to " + contacts);
        messages.add( new Message(contact, text ));

    }

/**
 it displays all sent messages
 @param receiver represents the contact whose messages  will be displayed
 */
    public void seeMessage( Contact receiver ){

         for (Message message : messages ){
             if (message.receiver.phoneNumber == receiver.phoneNumber)
                 System.out.println( message.text );
         }

    }

    /**
     * it makes a call
      * @param contact represents the contact that receives the call.
     */
    public void makeCall( Contact contact ){
        System.out.println( "It's calling "+contact);
        calls.add( contact);
    }

/**
id displays all made calls.
 */
    public void seeHistory(){
        System.out.println( "History: " );
        for ( Contact contact : calls ){
            System.out.println( contact );
        }
    }
}
