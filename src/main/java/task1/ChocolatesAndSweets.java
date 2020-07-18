package task1;
import java.util.*;
public class ChocolatesAndSweets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FiveStar> chocos=new ArrayList<FiveStar>();
		ArrayList<KajuBarfi> sweets=new ArrayList<KajuBarfi>();
		
		FiveStar choc1=new FiveStar();
		FiveStar choc2=new FiveStar(50,"ExtraChocoFiveStar");
		FiveStar choc3=new FiveStar(100,"HugeChocoFiveStar");
		chocos.add(choc1);
		chocos.add(choc2);
		chocos.add(choc3);
		
		KajuBarfi kb1=new KajuBarfi();
		KajuBarfi kb2=new KajuBarfi(1200,"ExtraSpecial");
		KajuBarfi kb3=new KajuBarfi(900,"Ordinary");
		sweets.add(kb1);
		sweets.add(kb2);
		sweets.add(kb3);
		
		System.out.println("Chocolates");
		for(Chocolate ch:chocos)
		{
			System.out.println("Name --> "+ch.getFoodName() +", Price --> "+ch.getPrice());
		}
		
		System.out.println("Sweets");
		for(Sweet sw:sweets)
		{
			System.out.println("Name --> "+sw.getFoodName() +", Price --> "+sw.getPrice());
		}
	}

}
