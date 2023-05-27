import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

// class pen    // * class is created
// {
//     String color ;   // *setting values
//     String type; 

//     public static void write ()  // creating a methoud
//     {
//         System.out.println("to check method");
//     }
                                                // //* */            //  * in class functions are called methods
//     public  void disp_prop()                               // *   method for display properties
//     {
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }

// * copy constructor

class Student {
    String name;
    int age;

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void print_info()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student()
    {

    }
}

public class classes {

    public static void main(String[] args) {

        // pen pen1 = new pen(); // * creating an object
        // pen pen2 = new pen(); //* syntax is class name obj name = new class name (
        // new is for dynamic memory allocation) */

        // pen1.color = "blue"; //* setting the porperties of the pen */
        // pen1.type = "gel";

        // pen2.color = " red";
        // pen2.type = "ball point";

        // pen1.disp_prop(); //* calling method for display properties */
        // pen1.write();
        // pen2.disp_prop();

        // * copy constructor

        Student s1 = new Student();
        s1.name = "Kunal";
        s1.age = 19 ;

        // s1.print_info();

        Student s2 = new Student(s1);
        s2.print_info();

    }

}
