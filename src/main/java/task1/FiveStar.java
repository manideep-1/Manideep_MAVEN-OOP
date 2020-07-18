package task1;

public class FiveStar extends Chocolate { //Inheritance is shown here
	public FiveStar() {
		chocoPrice=10;
		chocoName="FiveStar";
	}
	//Polymorphism is shown here using an overloaded constructor
	public FiveStar(int x,String y) {
		chocoPrice=x;
		chocoName=y;
	}
}

