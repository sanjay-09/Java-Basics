package Package;
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
public class Function {

    public static void main(String[] args){

     int[] nums={1,1,1,1,1};

     int[] ans=new int[nums.length];
     ans[0]=nums[0];
     for(int i=1;i<=nums.length-1;i++){
         int sum=0;
         for(int j=0;j<=i;j++){
             sum+=nums[j];

         }
        ans[i]=sum;
     }
     for(int val:ans){
         System.out.println(val);
     }


    }
    public static void reverse(int[] arr,int i,int j){

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }






}
