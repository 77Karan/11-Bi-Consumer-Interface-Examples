package pack01.to.print.anything;

import java.util.function.BiConsumer;

public class MainBiConsumer
{
	public static void main(String[] args)
	{
		BiConsumer<String, String> bipi = (arg1,arg2) -> {
			System.out.println("Good morning: >> "+arg1);
			System.out.println("Welcome to : >> "+arg2);
};

bipi.accept("Ashok","Banaglore");
		
	}

}
