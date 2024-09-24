import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    public static void main(String[] args) {
        // Erstellen der Liste mit asList
        List<String> liste = Arrays.asList("Apfel", "Banane", "Orange", "Traube");

        // 1. Anzeige der Liste mit einer for-each-Schleife
        System.out.println("Ausgabe mit for-each-Schleife:");
        for (String s : liste) {
            System.out.println(s);
        }

        // 2. Anzeige der Liste mit der forEach()-Methode und Lambda-Ausdruck
        System.out.println("Ausgabe mit forEach() und Lambda:");
        liste.forEach((String s) -> System.out.println(s));

        // 3. Anzeige der Liste mit Methodenreferenz
        System.out.println("Ausgabe mit forEach() und Methodenreferenz:");
        liste.forEach(System.out::println);

        // Optional: Verwenden eines expliziten Consumers
        Consumer<String> consumer = (String s) -> System.out.println(s);
        System.out.println("Ausgabe mit explizitem Consumer:");
        liste.forEach(consumer);
    }
}
