import java.util.Scanner;
//import java.util.Stack;

public class Main {

    static Scanner sc = new Scanner(System.in);
    //static int size = 4, choice ;
    //static Stack<String> stack1 = new Stack<>();
    public static void main(String[] args) {

        int[] num = {1,120,77,7,8,200,92,23,5,101,40,3,160,10};

            /*
        int size;
        do{
            size = sc.nextInt();
            int[]num = new int[size]
        }while(size >= 1 && size < 250); */

        System.out.println("==Arrays before sorting==");
        displayArray(num);
        insertionSort(num);

    }
    public static void displayArray(int[]num){
        System.out.println("====================");

        for(int i = 0 ; i < num.length ; i++){
            System.out.println("Number " + (i+1) + (": ") + num[i]);
        }
        System.out.println("====================");

    }
    public static void insertionSort(int[]num){
        int temp , in , out;
        char input1;
        String input2;

        do{
            System.out.print("Please Enter the character (m): ");
            input1 = sc.next().charAt(0);


        }while(input1 != 'm');

        System.out.print("\nNow Please enter (empty) for Ascending sorting: ");
        input2 = sc.next();
        System.out.println();


        if(input2.equals("empty")){

            for(out = 1 ; out < num.length ; out++){


                temp = num[out];
                for (in = out - 1 ; (in >= 0 && num[in] > temp) ; in--) {
                    num[in+1] = num[in];
                }
                num[in+1] = temp;

            }
            System.out.println("==Arrays After sorting==");

            displayArray(num);

        }else
            System.out.println("You did not click empty");

    }


}