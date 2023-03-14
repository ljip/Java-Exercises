import java.util.Scanner;

//-1 za izlaz iz programa

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj;
        int[] niz = new int[20];
        int zbrojParnih = 0;
        int i = 0;

        do {
            System.out.print("Unesite broj: ");
            broj = scanner.nextInt();

            switch (broj) {
                case 0:
                    continue;
                case -1:
                    break;
                default:
                    String dan = "";
                    switch (broj % 7) {
                        case 0:
                            dan = "Nedjelja";
                            break;
                        case 1:
                            dan = "Ponedjeljak";
                            break;
                        case 2:
                            dan = "Utorak";
                            break;
                        case 3:
                            dan = "Srijeda";
                            break;
                        case 4:
                            dan = "Cetvrtak";
                            break;
                        case 5:
                            dan = "Petak";
                            break;
                        case 6:
                            dan = "Subota";
                            break;
                        default:
                            System.out.println("Krivi unos");
                            break;
                    }
                    System.out.println(dan);

                    if (broj % 2 == 0) {
                        zbrojParnih += broj;
                    }

                    if (broj % 2 != 0) {
                        break;
                    }

                    niz[i] = broj;
                    i++;
            }
        } while (broj >= 0);

        System.out.println("Zbroj parnih brojeva je " + zbrojParnih);
    }
    }
