import library.Library;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.println("███╗   ██╗█████╗██████████╗██████╗███╗   ██╗█████╗██╗         ██╗    ████████╗██████╗ █████╗██████╗██╗   ██╗");
        System.out.println("████╗  ████╔══██╚══██╔══████╔═══██████╗  ████╔══████║         ██║    ████╔══████╔══████╔══████╔══██╚██╗ ██╔╝");
        System.out.println("██╔██╗ █████████║  ██║  ████║   ████╔██╗ ███████████║         ██║    ████████╔██████╔█████████████╔╝╚████╔╝ ");
        System.out.println("██║╚██╗████╔══██║  ██║  ████║   ████║╚██╗████╔══████║         ██║    ████╔══████╔══████╔══████╔══██╗ ╚██╔╝  ");
        System.out.println("██║ ╚██████║  ██║  ██║  ██╚██████╔██║ ╚██████║  █████████╗    ███████████████╔██║  ████║  ████║  ██║  ██║   ");
        System.out.println("╚═╝  ╚═══╚═╝  ╚═╝  ╚═╝  ╚═╝╚═════╝╚═╝  ╚═══╚═╝  ╚═╚══════╝    ╚══════╚═╚═════╝╚═╝  ╚═╚═╝  ╚═╚═╝  ╚═╝  ╚═╝   ");;

        do {
            firstMenu();
            switch (sc.nextInt()) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Masukkan Id : ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Password : ");
                    String pass = sc.nextLine();
                    boolean result = lib.userLogin(id, pass);
                    while (result) {
                        loginMenu(lib);
                        switch (sc.nextInt()) {
                            case 0 -> {
                                result = false;
                            }
                            case 1 -> {

                            }
                            case 2 -> {

                            }
                            case 3 -> {

                            }
                            case 4 -> {

                            }
                        }
                    }
                }

                case 2 -> {

                }
            }
            System.out.print("Ingin menetap : ");
            if (sc.next().charAt(0) != 'y') {
                break;
            }
        } while (lib.libraryStatus);
    }

    private static void firstMenu () {
        System.out.println("\n1. Login");
        System.out.println("2. Register");
        System.out.println("0. End Program");
        System.out.print("Masukkan Input : ");
    }

    private static void loginMenu (Library lib) {
        System.out.println("\n1. Pinjam Buku");
        System.out.println("2. Kembalikan Buku");
        System.out.println("3. Lihat Kumpulan Buku");
        if (lib.login.denda > 0) {
            System.out.println("4. Bayar Denda");
        }
        System.out.println("0. Logout");
        System.out.print("Masukkan Input : ");
    }
}
