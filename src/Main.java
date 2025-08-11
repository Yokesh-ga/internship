
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String moova[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> std_list = new ArrayList<>();
        ArrayList<String> std_name = new ArrayList<>();
        System.out.print("Enter the number of Students: ");
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;int u = 0;
        int max = Integer.MIN_VALUE;int k = 0;
        double avg = 0;
        for(int i = 1;i<=n;i++){
            System.out.print("Enter the name of Student "+i+":");
            String str = sc.next();
            std_name.add(str);
            System.out.print("Enter marks of "+i+":");
            int mark = sc.nextInt();
            std_list.add(mark);
            if(mark < min){
                min = mark;
                u = i;
            }
            if(mark > max){
                max = mark;
                k = i;
            }
            avg +=mark;
        }
        System.out.println("--- summary Report ---");
        System.out.println("Average Score : "+(avg / n));
        System.out.println("Highest Score : "+max +" by "+std_name.get(k - 1));
        System.out.println("Lowest Score : "+min +" by "+std_name.get(u - 1));

        System.out.println("List of All Students : ");
        for(int i = 0;i<n;i++){
            System.out.println("Name :"+std_name.get(i) +" , Mark : "+std_list.get(i));
        }
    }
}
