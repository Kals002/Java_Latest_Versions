package random.num.generators;

import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class Test1 
{
    public static void main(String[] args) {

        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        
        IntStream istream = randomGenerator.ints(5);
        
        istream.forEach(System.out :: println);
    }
}
