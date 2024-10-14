package org.andrapradesh;

import org.Kerala.Kerala;

public class AndraPradesh extends Kerala
{
    public void telugu()
    {
        System.out.println("speak telugu");
    }

    public static void main(String[] args)
    {
        AndraPradesh a = new AndraPradesh();
        a.telugu();
        a.malayalam();
        a.tamillanguage();
        a.india();
    }
}
