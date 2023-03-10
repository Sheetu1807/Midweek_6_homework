package instance_static_area;

//Calling: - Instance Variable to Instance method:- Direct
//Calling: - Instance Variable to Instance method:- Direct or Via class name
//Calling: - Instance Variable to Static method:- Direct or Via class name
//Calling: - Instance Variable to Static method:- Via Creating an object

public class Instance_Static_Methods {
    int a = 10; //Declared Instance variable

    float b = 20.10f; //Declared Instance variable
    static double c = 25.25d; // Declared Static variable
    static String name = "Java"; //Declared Static variable
    void m1() //Declared Instance method
    {
        System.out.println("Java is a Simple Language");
        int x =20; //Declared Local variable
        System.out.println(x);
        System.out.println(a); // called Instance Variable Directly
        System.out.println(name); // called Static Variable Directly
        System.out.println(Instance_Static_Methods.name); //// called Static Variable using Class name
    }

    static void m2() //Declared Static method
    {
        Instance_Static_Methods obj = new Instance_Static_Methods(); // Create an Object,
        //here Instance_Static_Methods is class name, obj reference variable name, new is a keyword and
        // Instance_Static_Methods() is a Constructor */
        System.out.println(obj.a); //Called Instance variable to static method using object name
        System.out.println(obj.b); //Called Instance variable to static method using object name
        System.out.println(name); //Called Static variable to static method Directly
        System.out.println(Instance_Static_Methods.c); //Called Static variable to static method via Class name
        System.out.println("Codebuster Testing");
        int y =5;
        System.out.println(y);
    }

    public static void main(String[] args) { //Main method or Pre-defined method
        Instance_Static_Methods a = new Instance_Static_Methods();
        a.m1(); // Called Instance method to Static method using object name
        m2(); // Called Static method to Static method Directly
        Instance_Static_Methods.m2(); // Called Static method to Static method via Class name
    }

}
