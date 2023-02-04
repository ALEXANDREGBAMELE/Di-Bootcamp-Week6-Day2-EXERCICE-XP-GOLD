package Exercice1;

public class FatherPanda {
public boolean isPredator = false;
private int poids = 0;
private int age = 0;

public void manger() {
	System.out.println("Le poids de Panda vaut : " + poids );
	System.out.println("son age vaut : " + age);
	return;
}
public static void main(String[] args) {
	FatherPanda fp = new FatherPanda();
	fp.manger();
}
}
