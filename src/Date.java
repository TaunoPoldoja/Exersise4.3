/**
 * Created by tauno on 13.11.2016.
 */
public class Date {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.print(day + ", ");
        System.out.print(month + " ");
        System.out.print(date + ", ");
        System.out.print(year);
    }
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.print(day+" ");
        System.out.print(date+" ");
        System.out.print(month+" ");
        System.out.print(year);
    }

    public static void main(String[] args){
        printAmerican("Sunday", 30,"October",2016);
        System.out.println();
        printEuropean("Sunday", 30,"October",2016);
        System.out.println();

    }
}
