package HierarchicalInheritance;

// PROGRAM FOR HIERARCHICAL INHERITANCE 

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
class sub2 extends super1
{
    void sub2_display()
    {
        System.out.println("Hello sub2 class");
    }
}
class sub3 extends super1
{
    void sub3_display()
    {
        System.out.println("Hello sub3 class");
    }
}

public class Hierarchical
{
    public static void main(String args[])
    {
        sub1 b = new sub1();
        b.super_display();
        b.sub1_display(); 

        sub2 c = new sub2();
        c.super_display();
        c.sub2_display(); 

        sub3 d = new sub3();
        d.super_display();
        d.sub3_display();
    }
}