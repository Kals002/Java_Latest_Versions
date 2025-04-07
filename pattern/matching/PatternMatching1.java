package pattern.matching;

public class PatternMatching1
{
    public static void main(String[] args) {

        Object obj1 = 78;

        display1(obj1);

        display2(obj1);
    }

    public static void display1(Object obj1)
    {
        if(obj1 instanceof Integer)
        {
            Integer num1 = (Integer)obj1;
            System.out.println(num1);
        }
    }
    public static void display2(Object obj1)
    {
        if(obj1 instanceof Integer num2)
        {
            System.out.println(num2);
        }
    }
}
