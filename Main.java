import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        //Aufgabe 1
        int a = 5;
        int b = 5;
        System.out.println(a + b);
        //Aufgabe 2
        System.out.println("bitte eine Nummer eingeben.");
        int numEven = getNumber.nextInt();
        numIsEven(numEven);
        //Aufgabe 3
        PrimeFinder primes=new PrimeFinder();
        primes.isPrime(100);

    }

    static void numIsEven(int number) {
        number = number % 2;
        if (number == 0) {
            System.out.println("die Zahl ist gerade");
            return;
        }
        System.out.println("die Zahl ist ungerade");
    }



}
