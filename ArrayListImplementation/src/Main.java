import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(10);
		number.add(200);
		number.add(30);
		number.add(400);
		
		System.out.println("list the elements:-");
		
		for(int element : number)
		{
			System.out.println(element);
		}
		System.out.println("size of arraylist is:- "+number.size());
		
		number.sort(null);
		for(int element : number)
		{
			System.out.println(element);
		}

	}

}
