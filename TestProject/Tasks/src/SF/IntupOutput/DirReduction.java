package SF.IntupOutput;


import java.util.Arrays;


public class DirReduction {
    public static void main(String[] args) {
        String[] arr = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        dirReduc(arr);
    }

    public static String[] dirReduc(String[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

                if (arr[i] == "NORTH" && arr[i+1] == "SOUTH") {
                    arr[i] = "null";
                    arr[i+1] = "null";
                } else if (arr[i] == "SOUTH" && arr[i+1] == "NORTH") {
                    arr[i] = "null";
                    arr[i+1] = "null";
                } else if (arr[i] == "WEST" && arr[i+1] == "EAST") {
                    arr[i] = "null";
                    arr[i+1] = "null";
                } else if (arr[i] == "EAST" && arr[i+1] == "WEST") {
                    arr[i] = "null";
                    arr[i+1] = "null";
                }
            }
            for (int z = 0; z < arr.length; z++) {
                for (int x = z + 1; x < arr.length; x++) {
                    if (arr[z] == "null") {
                        String t = arr[z];
                        arr[z] = arr[x];
                        arr[x] = t;
                    }
                }
            }

        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "null") {
                tmp++;
            }
        }
        String[] newarr = new String[tmp];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != "null")
                newarr[i] = arr[i];


        System.out.println(tmp);
        System.out.println(Arrays.toString(newarr));
        return newarr;

    }
}








