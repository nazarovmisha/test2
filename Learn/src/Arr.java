public class Arr {
/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

    public static void main(String[] args) {
        try {
            int [] m= new int [2];
            m[8]= 34;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}