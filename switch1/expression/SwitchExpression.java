package switch1.expression;

public class SwitchExpression
{
    public static void main(String[] args)
    {
        int num = 18;
        String str = "hello";

        System.out.println(display(str));

        Object obj = "k";

        System.out.println( display1(obj));

    }
    static String display(String str)
    {

        return switch(str)
        {
            case "1" -> "one";
            case "19" -> "two";
            default -> "no number";
        };
    }

    private static String display1(Object obj)
    {
        return switch (obj)
        {
            case Integer i -> "It is an integer";
            case String s -> "It is a string";
            default -> "It is none of the known data types";
        };

    }














}
