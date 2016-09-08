import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class randomNumberNoDuplicate 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students in the class: ");
        int size = input.nextInt();
       
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            System.out.print("Student "+list.remove(index) + " pairs up with ");
            int index2 = rand.nextInt(list.size());
            System.out.println("student "+list.remove(index2));
        }
    }
}
