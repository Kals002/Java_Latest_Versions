package sealed.classes;

public class Square extends Rectangle
{
    public void display()
    {
        super.display();
        System.out.println("Square");
    }

    public static void main(String[] args) {

        Square s = new Square();

        s.display();

    }
}
