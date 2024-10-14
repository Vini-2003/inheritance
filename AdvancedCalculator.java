public class AdvancedCalculator extends Calculator
{
    @Override
    public void calculate(int a,int b)
    {
        int c = a * b;
        System.out.println("Multiplying two integer values is : "+c);
    }
    public static void main(String[] args)
    {
        AdvancedCalculator ad = new AdvancedCalculator();
        ad.calculate(2,4);

        Calculator c = new AdvancedCalculator();
        c.calculate(2,4);
        c.calculate(2.0,4.0);   
    }
}