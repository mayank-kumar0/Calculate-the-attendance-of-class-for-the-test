import java.util.Scanner;
public class attendance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days ::");
        int arr_size=sc.nextInt();
        int []arr=new int[arr_size];
        System.out.println("Enter the attendance in 1 & 0 :");
        for(int i=0; i<arr_size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr_size; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        
        int start =0;
        for(int i=0; i<arr_size; i++){
            if(arr[i]==1){
                start ++;
            }
        }
        double percentage=(double)start/arr_size*100;
        if(percentage>=75){
            System.out.println("Percentage ::" + percentage +"= Eligible");
        }
        else{
            System.out.println("Percentage ::" + percentage + "= Not eligible");
        }
    }
}

