package Array;

public class test_array {
    public static void main(String[] args) {
        int arr[]=new int[5]; //declaration
        arr[0]=5; //initialization
        arr[1]=10;
        arr[2]=20;
        arr[3]=30;
        arr[4]=40;
        //traversing array 
        for(int i=0;i<arr.length;i++)//length is the property of array
        {
            System.out.println(arr[i]);
        }

    }
}
