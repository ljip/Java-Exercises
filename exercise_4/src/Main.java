import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> knjige = new HashMap<>();

        List<String> sortirano = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String knjiga, autor;

        System.out.println("Unesi knjige i autore. Za kraj unesi \"stop\".");

        while (true) {
            System.out.print("Naslov knjige: ");
            knjiga = sc.nextLine();
            if (knjiga.equals("stop")) {
                break;
            }
            System.out.print("Autor: ");
            autor = sc.nextLine();
            knjige.put(knjiga, autor);
        }

        for (String k : knjige.keySet()) {
            if (!sortirano.contains(k)) {
                sortirano.add(k);
            }
        }
        Collections.sort(sortirano);

        for (String k : sortirano) {
            System.out.println(k + " od " + knjige.get(k) + ".");
        }
    }
}