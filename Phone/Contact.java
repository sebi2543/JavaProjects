package Phone;

public class Contact {

    String firstName;
    String lastName;
    String phoneNumber;

    public Contact( String phoneNumber, String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
