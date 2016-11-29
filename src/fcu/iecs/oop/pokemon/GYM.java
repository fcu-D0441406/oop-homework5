package fcu.iecs.oop.pokemon;

public class GYM {

	public static void main(String[] args) {
		

	}
	public static void fight(Pokemon p1 , Pokemon p2)
	{
		if(p1.get_cp()>p2.get_cp())
		{
			p1.set_cp();
		}
		else
		{
			p2.set_cp();
		}
	}

}
