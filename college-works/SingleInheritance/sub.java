package SingleInheritance;

// PROGRAM FOR SINGLE INHERITANCE
class super1
{
    void super_display()
    {
        System.out.println("Hello super class");
    }
}

public class sub extends super1{
    void sub_display()
    {
        System.out.println("Hello sub class");
    }
    public static void main(String args[])
    {
        sub b = new sub();
        b.super_display();
        b.sub_display();
    }
}
