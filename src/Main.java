import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> A = new LinkedList<>();
        LinkedList<String> B = new LinkedList<>();
        LinkedList<String> C = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите " + (i+1) + " строку списка A: ");
            A.add(i, scanner.next());
        }
        System.out.println("Весь список А: " + A);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите " + (i+1) + " строку списка B: ");
            B.add(i, scanner.next());
        }
        System.out.println("Весь список B: " + B);
        Collections.reverse(B);
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println("Весь список C: " + C);
        C.sort(Comparator.comparing(String::length));
        System.out.println("Весь список C по возрастанию длины: " + C);
    }
}