import java.util.Scanner;


// tower of Hanoi Problem
public class Tower_of_Hanoi {
    int no_of_disks;
    char start;
    char middle;
    char end;
    //constructor
    Tower_of_Hanoi(int n,char start , char middle, char end)
    {
        no_of_disks = n;
        this.start = start;
        this.middle = middle;
        this.end = end;
    }
    int count = 0;                                         // count variable for calculating no of steps
    //method for implementing the logic
    public void hanoi(int n, char start, char middle, char end)
    {
        if(n>=1)
        {
            // logic of honoi problem
            hanoi(n-1, start, end, middle);
            System.out.println("Move Disk from: " + start +" to " + end);
            // Recursively calling hanoi method
            hanoi(n - 1, middle, start, end);
            count++;
        }
    }
    // method for printing the number of steps 
    public void countsteps()
    {
        System.out.println("Total Number of Steps: "+count);
    }
}

//execution class
class hanaoi_test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Disk:");
        int n = sc.nextInt();
        Tower_of_Hanoi obj = new Tower_of_Hanoi(n,'A', 'B', 'C');
        obj.hanoi(n,'A','B','C');
        obj.countsteps();
    }
}
