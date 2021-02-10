package com.praabindhp;
class C
{
    public void display()
    {
        System.out.println("Dog");
    }
}

class A extends 
{
    public void display()
    {
        System.out.println("Animal");
    }
}

class B extends 
{
    public void display()
    {
        System.out.println("Cat");
    }

}

class D extends A
{
    public void display()
    {
        System.out.println("D");
    }
    public static void main(String[] args){

        D obj = new D();
        obj.display();
    }
}
