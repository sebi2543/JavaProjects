package main.java.ro.sci.domain;

public class Message {
    String text;
    Contact receiver;
    public Message( Contact receiver, String text ){
        this.text = text;
        this.receiver = receiver;
}
}
