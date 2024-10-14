public class Laptop extends Electronic
{
    int ram;
    int storage;
    public Laptop(String name,double price,String brand,int warrentyPeriod,int ram,int storage)
    {
        super(name,price,brand,warrentyPeriod);
        this.ram = ram;
        this.storage = storage;
    } 

    public static void main(String[] args)
    {
        Laptop l = new Laptop("Dell xps 15",50000,"Dell",24,16,512);
        System.out.println("----Laptop Information----");
        System.out.println("Product name = "+l.name);
        System.out.println("Price = "+l.price);
        System.out.println("Brand = "+l.brand);
        System.out.println("warrenty period = "+l.warrentyPeriod);
        System.out.println("RAM = "+l.ram);
        System.out.println("Storage = "+l.storage);
    }
}