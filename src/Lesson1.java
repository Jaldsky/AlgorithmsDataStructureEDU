public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(fibNaive(5));
        System.out.println(fibEffective(5));

    }
    //наивный, медленный, очевидный 100 число фибоначи будет выполняться несколько лет
    //оценка быстродействия O(2^n)
    private static long fibNaive(int n){
        if (n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }
    //более эффективный метод
    //оценка быстродействия O(n+n) == O(2n) == O(n) т.к время выполнения растет пропорционально n
    private static long fibEffective(int  n){
        long[] arr = new long[n + 1]; //сложность O(n)

        arr[0] = 0; //O(1) константная сложность
        arr[1] = 1; //O(1) константная сложность

        //n = 2, итераций в цикле 1
        //n = 3, итераций в цикле 2
        //n = 4, итераций в цикле 3
        for (int i = 2; i <= n; i++){ //сложность O(n)
            arr[i] = arr[i-1] + arr[i-2];
        }
    return arr[n]; //O(1)
    //O(n) + O(1) + O(1) + O(n) + O(1) = O(2n) + O(3) = O(n)
    }
}
