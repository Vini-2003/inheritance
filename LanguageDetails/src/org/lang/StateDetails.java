package org.lang;

public class StateDetails extends LanguageInfo
{
    public void southIndia()
    {
        System.out.println("South");
    }
    public void northIndia()
    {
        System.out.println("north");
    }
    public static void main(String[] args)
    {
        StateDetails s = new StateDetails();
        s.southIndia();
        s.northIndia();
        s.tamilLanguage();
        s.englishLanguage();
        s.hindiLanguage();
    }
}
