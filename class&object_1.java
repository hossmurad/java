
public class Main
{
	int id;
	String name;
	
	
	public static void main(String[] args) {
		System.out.println("hossSystem");
		Main obj1 = new Main();
		obj1.id = 44;
		obj1.name = "Murad";
		Main obj2 = new Main();
		obj2.id = 45;
		obj2.name = "Shuvo";
		
		//output 
		System.out.println(obj1.id+" "+obj1.name);
		System.out.println(obj2.id+" "+obj2.name);
	}
}
