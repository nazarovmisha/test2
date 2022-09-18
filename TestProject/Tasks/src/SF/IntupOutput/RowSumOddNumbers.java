package SF.IntupOutput;

//Given the triangle of consecutive odd numbers:
//
//        1
//        3     5
//        7     9    11
//        13    15    17    19
//        21    23    25    27    29
//        ...
//        Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
//
//        1 -->  1
//        2 --> 3 + 5 = 8

public class RowSumOddNumbers {
    public static void main(String[] args) {
        rowSumOddNumbers(42);
    }

    public static int rowSumOddNumbers(int n) {
        int maxi = 0;
        int mini;
        int result = 0;
        int f = n;
        for (int j; n > 0; n--) {
            maxi += n;//ищем элемен с максимальным индексом в строке
        }
        mini = maxi - f;//ищем элемент с минимальным индексом в строке
        int d = mini;//
        int[] arr = new int[maxi + 1];//хранение элеметов пирамиды
        for (int i = 0; i < maxi; i++) {
            arr[i] = i + i + 1;
        }

        for (; d <= maxi; d++) {//считаем сумму строки пирамиды
            result += arr[d];
        }
        return result;
    }
}