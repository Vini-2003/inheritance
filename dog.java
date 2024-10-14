public class dog extends animal
{
    @Override
    public void speak()
    {
        System.out.println("bow bow");
    }
    public static void main(String[] args)
    {
        animal dog = new dog();
        dog.speak();
        animal cat =new cat();
        cat.speak();
    }
}