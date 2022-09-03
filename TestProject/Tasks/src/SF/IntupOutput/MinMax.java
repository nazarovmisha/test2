package SF.IntupOutput;

import java.util.Arrays;

class MinMax {
    public static void main(String[] args) {
        int [] arr = {2334454,5};
        minMax(arr);
    }
    public static int[] minMax(int[] arr) {
    for (int i=0;i< arr.length;i++){
        for (int j=i+1;j< arr.length;j++){
            if (arr[i] > arr[j]) {
                int tmp =arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;

            }
        }
    }
        int [] newArr = new int[2];
        newArr[0]=arr[0];
        newArr[1]=arr[arr.length-1];
        System.out.println(Arrays.toString(newArr));
        return  newArr;
    }

}