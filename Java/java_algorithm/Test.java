
public class Test{
	public static void main(String[] args){
		String[] names ={"Michael","Orson","Andrew"};
		String[] animal = new String[4];
		names = animal;
		System.out.println(names.length);
		System.out.println(animal.length);
	}
}
