import java.util.*;
import java.util.stream.IntStream;

public class JavaPractice2
{
	static Scanner sc = new Scanner(System.in);
	
	final double SHORTPI = 3.14159;
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World");
		int var1 = 100;
		int var2 = 200; 
		if (var1 == var2) 
		{
			System.out.println("var1 is not the same as var2");
		}
		else if (var1<var2) 
		{
			System.out.println("var1 is less then var2");
		}
		else 
		{
			System.out.println("Whatever");
		}
		
		for(int i = 0; i < 100; i++)
		{
			System.out.println(i);
		}
		
		String [] movies = {"IronMan", "SpiderMan", "BlackPather", "Thor", "Captain America"};
		
		for(int i = 0; i < movies.length; i++)
		{
			System.out.println(movies[i]);
		}
	}
	
		

}
