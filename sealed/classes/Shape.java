package sealed.classes;

public sealed class Shape permits Rectangle
{
    public void display()
    {
        System.out.println("Shape");
    }
}
