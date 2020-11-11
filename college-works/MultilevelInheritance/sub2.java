package MultilevelInheritance;

// PROGRAM FOR MULTILEVEL INHERITANCE

class super1
{
    void super_display()
    {
        System.out.println("Hello super class");
    }
}

class sub1 extends super1
{
    void sub1_display()
    {
        System.out.println("Hello sub1 class");
    }
}


public class sub2 extends sub1{
    void sub2_display()
    {
    System.out.println("Hello sub2 class");
    }
    public static void main(String args[])
    {
    sub2 b = new sub2();
    b.super_display();
    b.sub1_display();
    b.sub2_display();
    }
}

