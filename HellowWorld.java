import java.io.*;

class HellowWorld
{
    public static void main(String args[]){
        System.out.println("Hello World.");
        Echo o1 = new Hello().echo();
        Echo o2 = new GoodBye().echo();
    }
}

abstract class Echo
{
    abstract public Echo echo();
}

class Hello extends Echo
{
    public Hello echo()
    {
        System.out.println("Hello");
        return this;
    }
}

class GoodBye extends Echo
{
    public GoodBye echo()
    {
        System.out.println("GoodBye");
        return this;
    }
}
