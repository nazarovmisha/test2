public class Separator {


    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (n == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] myarr1 = {1,544,55, 47, 555, 5};
        System.out.println(contains(myarr1, 544));
        System.out.println(contains(myarr1, 777));
        System.out.println(contains(myarr1, 47));
    }

}