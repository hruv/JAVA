package com.company;

public class java14
{
    public static void main(String[] args)
    {
//        String s="Ahira";
//        s=s.toLowerCase();
//        System.out.println(s);
//        output: ahira


    String name = "Harry";
    // System.out.println(name);
    int value = name.length();
    System.out.println(value);

    String lstring = name.toLowerCase();
    System.out.println(lstring);

    String ustring = name.toUpperCase();
    System.out.println(ustring);

    String nonTrimmedString = "     Harry     ";
    System.out.println(nonTrimmedString);

    String tstr = nonTrimmedString.trim();
    System.out.println(tstr);

    System.out.println(name.substring(1));
    System.out.println(name.substring(1,5));
    System.out.println(name.substring(1,3));
    //include first// exclude second

    System.out.println(name.replace('r', 'p'));
    System.out.println(name.replace("r", "ier"));

    System.out.println(name.startsWith("Har"));
    System.out.println(name.endsWith("dd"));

    System.out.println(name.charAt(4));

    String modifiedName = "Haarryrryrry";
          //includes     //012345678910

    System.out.println(modifiedName.indexOf("rry"));//pahila wala,index k peeche ka gayab
    System.out.println(modifiedName.indexOf("rry", 3));
    System.out.println(modifiedName.indexOf("rry", 4));
    System.out.println(modifiedName.indexOf("rry", 6));

    System.out.println(modifiedName.lastIndexOf("rry"));
    System.out.println(modifiedName.lastIndexOf("rry", 3));
    System.out.println(modifiedName.lastIndexOf("rry", 6));//include
    System.out.println(modifiedName.lastIndexOf("rry", 10));//alhir wala,index k aggey ka gayab

    String h="HarRy";
    System.out.println(name.equals("Harry"));
    System.out.println(name.equals(h));
    System.out.println(name.equalsIgnoreCase("HarRY"));

    System.out.println("I am escape sequence\tdouble quote");




}
}

