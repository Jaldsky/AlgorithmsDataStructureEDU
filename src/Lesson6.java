public class Lesson6 {
    public static void main(String[] args) {
        System.out.println(bynarySearch(new int[] {-1, 3, 5, 8, 10, 15, 16, 20}, 16));

    }
    public static int bynarySearch(int[] m, int key){
        int low = 0;
        int hight = m.length - 1;

        while (low <= hight){
            int middle = low + (hight - low) / 2;

            if (key < m[middle]){
                hight = middle - 1;
            } else if (key > m[middle]){
                low = middle + 1;
            } else {
                return  middle;
            }
        }
        return -1;//элемента нет в массиве
    }
}
