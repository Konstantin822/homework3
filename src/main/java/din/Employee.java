package din;

public class Employee {
    String firstName;
    String middleName;
    String lastName;
    String position;
    String email;
    int phoneNumber;
    int age;

    public Employee(String firstName, String middleName, String lastName, String position, String email, int phoneNumber, int age) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.age = age;

            System.out.println("Last name: " + this.lastName + "\n" + "First name: " + this.firstName + "\n" + "Middle name: " + this.middleName + "\n" + "Position: " + this.position + "\n" + "Email: " + this.email + "\n" + "Phone number: " + this.phoneNumber + "\n" + "Age: " + this.age);
    }
}

