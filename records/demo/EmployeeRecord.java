package records.demo;

public record EmployeeRecord(Integer id, String name) implements Cloneable
{
    /*
            - It's an immutable class(final).
            - All other methods (concrete, static etc.) can be included.
            - can implement an interface but can't extend any class or record.
            - It acts like data container.
     */

    public EmployeeRecord
    {
        if(id < 19)
        {
            throw new RuntimeException("Id should be greater than 19");
        }
    }
    public static void display()
    {
        System.out.println("display method");
    }

    public static void main(String[] args)
    {
        EmployeeRecord employeeRecord1 = new EmployeeRecord(91, "john");
        System.out.println(employeeRecord1.id);
        System.out.println(employeeRecord1.name);

        EmployeeRecord.display();

    }
}