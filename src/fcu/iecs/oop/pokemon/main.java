package fcu.iecs.oop.pokemon;

public class main {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("aaa",50);
		Pokemon p2 = new Pokemon("bbb",80);
		GYM.fight(p1,p2);
		Pokemon p3 = new Pokemon("ccc",590);
		GYM.fight(p1, p3);
		int a = p3.get_cp();
		System.out.print(a);
	}

	

}
