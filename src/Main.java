import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");

        String imie = "Jan";
        int rokUrodzenia = 2005;
        double czasDoMatury = 0.66;

        int obecnyRok = Year.now().getValue();
        int wiek = obecnyRok - rokUrodzenia;
        System.out.println("Mam na imię " + imie + ", mam " + wiek + " lat i będę pisać maturę za " + czasDoMatury + " roku.");

        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double stopnie = scanner.nextDouble();
        double fahrenheit = 1.8 * stopnie + 32.0;
        System.out.println("W Fahrenheitach: " + fahrenheit);

        System.out.print("Podaj bok A trójkąta: ");
        double bokA = scanner.nextDouble();
        System.out.print("Podaj bok B trójkąta: ");
        double bokB = scanner.nextDouble();
        System.out.print("Podaj bok C trójkąta: ");
        double bokC = scanner.nextDouble();
        System.out.println("Obwód wynosi: " + (bokA + bokB + bokC));

        scanner.nextLine();

        System.out.print("Podaj 1 słowo: ");
        String s1 = scanner.nextLine();
        System.out.print("Podaj 2 słowo: ");
        String s2 = scanner.nextLine();
        System.out.print("Podaj 3 słowo: ");
        String s3 = scanner.nextLine();
        System.out.println(s3 + ", " + s2 + ", " + s1);

        System.out.print("Podaj jeden wyraz: ");
        String wyraz = scanner.nextLine();
        System.out.println("Liczba znaków: " + wyraz.length());

        int x = 5;
        int y = 2;
        double wynik = (double) x / y;
        System.out.println("Wynik dzielenia: " + wynik);

        System.out.print("Podaj słowo: ");
        String doWielkich = scanner.nextLine();
        System.out.println("DUŻE LITERY: " + doWielkich.toUpperCase());

        System.out.print("Podaj promień koła (liczba całkowita): ");
        int promien = scanner.nextInt();
        double pole = Math.PI * promien * promien;
        System.out.println("Pole koła wynosi: " + pole);

        scanner.close();
    }
}
