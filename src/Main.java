import java.util.*;


public class Main {
    public static void main(String[] args) {

        int [] myArray = new int [100];

        Random rnd = new Random();

        int sum =0;
        int avg = 0;
        int userinput = 0;
        int count = 0;
        int min=0;
        int tempvalue = 0;
        int minlocation = 0;
        int max = 0;
        int maxlocation =0;
        int occurance =0;
        int contain =0;





        Scanner in = new Scanner(System.in);



        for(int i =0; i < myArray.length; i ++){

            myArray[i] = rnd.nextInt(100);



        }
        for(int i =0; i < myArray.length; i ++){

            System.out.print(myArray[i] + " | ");
            sum = sum+myArray[i];

        }
        System.out.println();


        System.out.println("number found = " + contains(myArray,contain) );

        System.out.println("the sum of the array is: " + sum(myArray) );

        System.out.println("max datapoint is at: " + max(myArray) );

        System.out.println("minimum datapoint is at: " + min(myArray) );


        System.out.println("your number was found: " + occuranceScan(myArray,occurance) + " times");
/*

        System.out.println("Average of dataPoints is: " + getAverage(myArray));


        min = myArray[0];
        //linear scan
        for(int i = 0; i < myArray.length; i ++){

            if(myArray[i] < min){
                min = myArray[i];
                minlocation = i;
            }

        }
        System.out.println();
        System.out.println("the minimum number is " +min+ " was found at "+minlocation);
        max = myArray[0];
        //linear scan
        for(int i = 0; i < myArray.length; i ++){

            if(myArray[i] < max){
                min = myArray[i];
                maxlocation = i;
            }

        }
        System.out.println();
        System.out.println("the maximum number is " +max+ " was found at "+minlocation);



/*
while(true) {
    System.out.println();
    userinput = safeinput.getInt(in,"pick a number 1-100");
    for (int i = 0; i < myArray.length; i++) {


        if (myArray[i] == userinput) {
            count = i ;
            System.out.println("your number was found at " + count);
            break;

        }


    }
    break;
}




/*
        System.out.println();
        userinput =safeinput.getIntRange(in,"pick a number 1-100 ",0,100);

        for(int i =0; i < myArray.length; i ++){

       if (myArray[i] == userinput){
           count = count+ 1;
       }

    }

        System.out.println("your number was found "+count + " times");


        avg = sum / myArray.length;
        System.out.println("the sum of the array is "+sum);
        System.out.println();
       System.out.println("the avg of the array is "+avg);

*/



    }

    public static boolean contains(int values[], int target){
        int userinput =0;
        int count = 0;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        userinput =safeinput.getIntRange(in,"pick a number 1-100 ",0,100);


        do {

            for (int i = 0; i < values.length; i++) {


                if (values[i] == userinput) {
                    count = i ;
                    done = true;



                }


            }

        }while(!done);
        return done;
    }
    public static int sum(int values[]){

        int sum = 0;

        for(int i =0; i < values.length; i ++){


            sum = sum+ values[i];

        }


return sum;
    }

    public static int occuranceScan(int values[], int target) {
        int userinput =0;
        int count = 0;
        int occurance = 0;
        Scanner in = new Scanner(System.in);

        System.out.println();
        occurance =  (safeinput.getIntRange(in,"pick a number 1-100 ",0,100));

        for(int i =0; i < values.length; i ++){

            if (values[i] == userinput){
                count = count+ 1;
            }

        }

        //System.out.println("your number was found "+ count + " times");
        return count;
    }
    public static int max(int values[]){
        int max =0;
        int maxlocation = 0;
        max = values[0];
        //linear scan
        for(int i = 0; i < values.length; i ++){


            if(values[i] > max){
                max = values[i];
                maxlocation = i;
            }

        }
        System.out.println();
return maxlocation;

    }
public static int min(int values[]) {
        int min=0;
        int minlocation = 0;

    min = values[0];
    //linear scan
    for (int i = 0; i < values.length; i++) {

        if (values[i] < min) {
            min = values[i];
            minlocation = i;
        }

    }
    System.out.println();

return minlocation;
}

    public static double getAverage(int values[]) {

        double sum =0;
        double avg = 0;
        for(int i =0; i < values.length; i ++){

            System.out.print(values[i] + " | ");
            sum = sum+ values[i];

        }


        avg = sum / values.length;
        System.out.println("the sum of the array is " + sum);
        System.out.println();
        System.out.println("the avg of the array is " + avg);
        return avg;
    }
}