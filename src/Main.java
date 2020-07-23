import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int j;
       int[] arr = {1, 0, 1, 1, 0, 1, 0, 1, 0, 0};//первое задание
       for(int i = 0; i<arr.length; i++){
           if(arr[i]==1){
               arr[i]=0;
           }
           else {
               arr[i]=1;
           }
       }
        System.out.println(Arrays.toString(arr));

       int[] arr2 = new int[8];//второе задание
        for (int i = 0; i <arr2.length ; i++) {
          arr2[i] = i*3;
        }
        System.out.println(Arrays.toString(arr2));

      int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};// третье задание
        for (int i = 0; i <arr3.length; i++) {
         if(arr3[i]<6){
             arr3[i]*=2;
         }
        }
        System.out.println(Arrays.toString(arr3));

      int[][] arr2d = new int[7][7]; // четвертое задание
        for(int i=0; i<arr2d.length-1; i++)
            arr2d[i][i]=1;
        for(int i=0; i<arr2d.length-1; i++)
        {
            j=arr2d.length-1-i;
            arr2d[i][j]=1;
        }
        printarr2d(arr2d);

    }
    public static void printarr2d(int[][] arr2d) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.printf("%5d", arr2d[i][j]);
            }
            System.out.println();
        }
    }
}
