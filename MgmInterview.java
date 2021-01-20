import java.util.Arrays;

//Your task is to:
//- fix the code
//- improve the poor quality of this code.
//
// (You can change anything you want
//
//The class should sort food instances and output the following lines:
//
//Potato 1
//Potato 9
//Potato 11
//Tomato 11
//Potato 12
//Potato 42
//Potato 46
//Potato 55
//Potato 77
//Tomato 121
//
public class MgmInterview 
{
	public static FOOD[] potatoes = null;

	public abstract class FOOD {
		public int size = 11;

		public String whoAMI() {
			return this.getClass().getName()
					.substring(MgmInterview.class.getName().length() + 1);
		}
	}

	public class Potato extends FOOD {
		//
	}

	public class Tomato extends FOOD {
		// default size for tomato
//		public int size = 121;
	}

	public void main() {
		
		// sort food
		final FOOD[] SORTEDFOOD = new FOOD[10];
		for (int i = 0; i < 10; i++) 
		{
			int index_of_the_smaller_food=i;
			for (int j = i; j < 10; j++) 
			{
				if(potatoes[index_of_the_smaller_food].size > potatoes[j].size)
				{
					index_of_the_smaller_food=j;
				}
				if(potatoes[index_of_the_smaller_food].size == potatoes[j].size && potatoes[index_of_the_smaller_food].whoAMI().contains("Tomato"))
				{
					index_of_the_smaller_food=j;
				}
			}
			SORTEDFOOD[i]=potatoes[index_of_the_smaller_food];
			potatoes[index_of_the_smaller_food]=potatoes[i];
		}

		//print result
		for (final FOOD potato : Arrays.asList(SORTEDFOOD)) {
			System.out.println(potato.whoAMI() + " " + potato.size);
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MgmInterview fs = new MgmInterview();

		potatoes = new FOOD[10];
		final Tomato p0 = fs.new Tomato();
		p0.size = 11;
		potatoes[0] = p0;
		final Tomato p1 = fs.new Tomato();
		p1.size = 121;
		potatoes[1] = p1;

		final Potato p2 = fs.new Potato();
		p2.size = 1;
		potatoes[2] = p2;
		final Potato p3 = fs.new Potato();
		p3.size = 42;
		potatoes[3] = p3;
		final Potato p4 = fs.new Potato();
		p4.size = 77;
		potatoes[4] = p4;
		final Potato p5 = fs.new Potato();
		p5.size = 55;
		potatoes[5] = p5;
		final FOOD p6 = fs.new Potato();
		p6.size = 46;
		potatoes[6] = p6;
		final FOOD p7 = fs.new Potato();
		p7.size = 12;
		potatoes[7] = p7;
		final Potato p8 = fs.new Potato();
		p8.size = 11;
		potatoes[8] = p8;
		final Potato p9 = fs.new Potato();
		p9.size = 9;
		potatoes[9] = p9;

		fs.main();
	}

}
