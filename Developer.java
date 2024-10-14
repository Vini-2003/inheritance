public class Developer extends Employee
{
    String programmingLanguage;
    public Developer(String name,int salary,String programmingLanguage)
    {
        super(name,salary);
        this.programmingLanguage = programmingLanguage;
    }
    public double calculateBonus()
    {
        return salary*0.10;
    }
    public static void main(String[] args)
    {
        Developer d = new Developer("Vini",10000,"java");
        System.out.println("Developer name:"+d.name+"\n"+"Salary:"+
        d.salary+"\n"+"Programming Language:"+d.programmingLanguage);
        double b = d.calculateBonus();
        System.out.println("Bonus:"+b);
        System.out.println("---------------------");
        Manager m =new Manager("Vino",20000,"Sales");
        System.out.println("Manager name:"+m.name+"\n"+"Salary:"+
        m.salary+"\n"+"Department:"+m.department);
        System.out.println("Bonus:"+m.calculateBonus());
    }

}