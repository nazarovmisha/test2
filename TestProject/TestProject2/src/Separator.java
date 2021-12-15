public class Separator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 47, 2, 1, 5, 4, 8, 5};
            int k = 0, now = 0;
            for (int i : arr) {
                if (k % 2 == 0)
                    k++;
            }

            int[] chet = new int[k];
            for (int i : arr) {
                if ((arr[i]) % 2 == 0) {
                  int [now] even = arr[i];
                    now +=1;
                    System.out.println(even);
                }

            }

        }
    }















