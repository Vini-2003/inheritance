public class Electronic extends Product
{
    String brand;
    int warrentyPeriod;
    public Electronic(String name,double price,String brand,int warrentyPeriod)
    {
        super(name,price);
        this.brand = brand;
        this.warrentyPeriod = warrentyPeriod;
    } 
}