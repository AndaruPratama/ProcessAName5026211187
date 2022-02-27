import java.util.Scanner;

public class ProcessAName5026211187 {
    public static void main (String[] args){

        String FullName, LastName;
        int SpaceIdx;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your full name :");
        FullName = sc.nextLine();
        SpaceIdx = FullName.indexOf(" ");
        LastName = FullName.substring(SpaceIdx+1);
        System.out.println("Your name is " +LastName+ ", " +FullName.charAt(0)+ ".");


    }
}
