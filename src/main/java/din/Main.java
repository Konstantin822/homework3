package din;

import din.package1.SameName;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Gordon", "Smith", "Manager", "example", 4221, 21);

        Car car = new Car();
        car.start();

        SameName p = new SameName();
        p.name = "apex";
        din.package1.package2.SameName f = new din.package1.package2.SameName();
        f.age = 34;
    }
}
