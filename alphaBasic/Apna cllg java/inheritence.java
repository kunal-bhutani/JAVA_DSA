import CustomPackage.Bank;
class Vehicle {
    String color;
}

class Car extends Vehicle{

}

public class inheritence{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "red";
        System.out.println(c1.color);

        Bank account1 = new Bank();
        account1.display();
        // account1.name = "coustmer1";
        // System.out.println(account1.name);
    }
}


