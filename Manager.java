public class Manager extends Employee
{
    String department;
    public Manager(String name,int salary,String department)
    {
        super(name,salary);
        this.department = department;
    } 
    public double calculateBonus()
    {
        return salary*0.20;
    }
}