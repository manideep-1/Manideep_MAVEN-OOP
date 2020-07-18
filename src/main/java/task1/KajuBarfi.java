package task1;

public class KajuBarfi extends Sweet { //Inheritance is shown here
	public KajuBarfi() {
		sweetPrice=1000;
		sweetName="KajuBarfi";
	}
	//Polymorphism is shown here using an overloaded constructor
	public KajuBarfi(int x,String y) {
		sweetPrice=x;
		sweetName=y;
	}
}
