import java.util.Arrays;
import java.util.Comparator;

public class Lesson5 {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3};

        final int W = 7;
        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed()); //O(n*log(n))

        System.out.println(Arrays.toString(items));

        while (currentItem < items.length && weightSoFar != W){
            if (weightSoFar + items[currentItem].getWeight() < W){//берем объект целиком
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {//берем часть объекта
                valueSoFar += (W - weightSoFar) / (double) items[currentItem].getWeight() *
                        items[currentItem].getValue();

                weightSoFar = W; //полный рюкзак
            }
            currentItem++;
        }
        System.out.println("Ценность наилучшего набора: " + valueSoFar);
    }
}
class Item{
   private int weight;
   private int value;

   Item(int weight, int value){
       this.weight = weight;
       this.value = value;
   }

   public double valuePerUnitOfWeight(){
       return value / (double) weight;
   }

   public int getWeight() {
       return weight;
   }
   public int getValue() {
       return value;
   }
   public String toString(){
       return "{w:" + weight + ", v:" + value + "}";
   }
}
