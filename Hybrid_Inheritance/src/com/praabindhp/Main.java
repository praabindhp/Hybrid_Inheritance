package com.praabindhp;
class C
{
    public void display()
    {
        System.out.println("Cat");
    }
}

class A extends C
{
    public void display()
    {
        System.out.println("Animal");
    }
}

class B extends C
{
    public void display()
    {
        System.out.println("Bat");
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