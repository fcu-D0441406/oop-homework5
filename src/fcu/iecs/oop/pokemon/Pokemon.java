package fcu.iecs.oop.pokemon;

public class Pokemon {

	public String name;
	public static  int cp;
	public Pokemon(String string, int i) {
		name = string;
		cp = i;
	}
	public static void main(String[] args) {
		

	}
	public  String get_n()
	{
		return name;
	}
	public  int get_cp()
	{
		return cp;
	}
	public static void set_cp()
	{
		cp = cp + 500;
	}

}
