import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class FrutasAragon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fruits = new ArrayList<Fruit>();

		fruits.add(new Fruit("Pineapple", "  ", 3));
		fruits.add(new Fruit("Apple", "  ", 5));
		fruits.add(new Fruit("Orange", "  ", 10));
		fruits.add(new Fruit("Banana", "  ", 34));

		Collections.sort(fruits);

		int i=0;
		for(Fruit temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp.toString());
		}

		Collections.sort(fruits, FruitNameComparator);


		i=0;
		for(Fruit temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp.toString());
		}

	}
	
	public static Comparator<Fruit> FruitNameComparator = new Comparator<Fruit>() {

	    public int compare(Fruit fruit1, Fruit fruit2) {

	      String fruitName1 = fruit1.getFruitName().toUpperCase();
	      String fruitName2 = fruit2.getFruitName().toUpperCase();

	      //ascending order
	      return fruitName1.compareTo(fruitName2);

	      //descending order
	      //return fruitName2.compareTo(fruitName1);
	    }

	};


}
