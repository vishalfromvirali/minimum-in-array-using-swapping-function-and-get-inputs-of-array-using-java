import java.util.*;
class minimum{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the arr length : ");
        int length =scan.nextInt();
        int temp;
        int count =0;
        int[] arr=new int [length];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the array inde value : "+i+" :");
            int value=scan.nextInt();
            arr[i] =value;
            
        }
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]>arr[k]){
                temp =arr[j];
                arr[j]=arr[k];
                arr[k] =temp;
            }

            }
            
        }

        System.out.println(Arrays.toString(arr)); 
    }
}