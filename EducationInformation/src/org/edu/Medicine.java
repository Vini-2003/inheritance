package org.edu;

public class Medicine extends Engineering
{
    public void physiyo()
    {
        System.out.println("physiyology");
    }
    public void dental()
    {
        System.out.println("dental");
    }
    public void mbbs()
    {
        System.out.println("MBBS");
    }
    public static void main(String[] args)
    {
        Medicine m = new Medicine();
        m.physiyo();
        m.dental();
        m.mbbs();
        m.bE();
        m.bTech();
        m.bsc();
        m.bEd();
        m.bA();
        m.bBA();
        m.ug();
        m.pg();
    }
}
