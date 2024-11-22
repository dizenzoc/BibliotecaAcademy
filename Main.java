import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        Biblioteca biblioteca = new Biblioteca();

        // utenti di esempio
        biblioteca.aggiungiUtente(new Utente("admin", "password123"));
        biblioteca.aggiungiUtente(new Utente("user1", "pass1"));
        
        Utente utente = richiestaLogin(biblioteca, scanner);

        if (utente != null) {
            System.out.println("Login effettuato con successo!");
            // Mostra il menu
            boolean menu = true;
            while (menu) {
                mostraMenu();

                int scelta = scanner.nextInt();
                scanner.nextLine(); 

                switch (scelta) {
                    case 1:
                        registraUtente(biblioteca, scanner);
                        break;
                    case 2:
                        biblioteca.stampaLibriDisponibili();
                        break;
                    case 3:
                        prendiLibroInPrestito(biblioteca, scanner);
                        break;
                    case 4:
                        restituisciLibro(biblioteca, scanner);
                        break;
                    case 5:
                        aggiungiLibro(biblioteca, scanner);
                        break;
                    case 6:
                        rimuoviLibro(biblioteca, scanner);
                        break;
                    case 7:
                        rimuoviUtente(biblioteca, scanner);
                        break;
                    case 8:
                        menu = esciDalMenu();
                        break;
                    default:
                        sceltaNonValida();
                }
            }
         } else {
             System.out.println("Username o password errati. Riprova.");
         }

         scanner.close();
    }

    private static Utente richiestaLogin(Biblioteca biblioteca, Scanner scanner){
        // richiesta di username e password
        System.out.println("Benvenuto nel Sistema! per proseguire sei pregato di effettuare il login...");
        System.out.print("Inserisci username: ");
        String username = scanner.nextLine();
        System.out.print("Inserisci password: ");
        String password = scanner.nextLine();

        // Verifica del login
        return biblioteca.verificaCredenziali(new Utente(username, password));
    }

    private static void mostraMenu(){
        // Creo un menu per le funzionalita'
        System.out.println("\nMENU BIBLIOTECA");
        System.out.println("1. Registra Utente");
        System.out.println("2. Stampa Libri disponibili.");
        System.out.println("3. Prendi Libro in prestito");
        System.out.println("4. Restituisci Libro.");
        System.out.println("5. Aggiungi Libro");
        System.out.println("6. Rimuovi Libro.");
        System.out.println("7. Rimuovi Utente.");
        System.out.println("8. Esci dal menu.");
        System.out.print("\nScegli una funzione: ");
    }

    private static boolean esciDalMenu() {
        System.out.println("Sistema chiuso correttamente! Grazie per averci scelto.");
        return false;
    }

    private static void sceltaNonValida() {
        System.out.println("Nessuna funzionalità esistente per la scelta inserita. Riprova.");
    }

    private static void registraUtente(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Inserisci username: ");
        String user = scanner.nextLine();
        System.out.print("Inserisci password: ");
        String pwd = scanner.nextLine();
        biblioteca.aggiungiUtente(new Utente(user, pwd));
        System.out.println("Nuovo utente registrato con successo!");
    }

    private static void prendiLibroInPrestito(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Inserisci il titolo del libro da prendere in prestito: ");
        String titolo = scanner.nextLine();
        biblioteca.prestaLibro(titolo);
        System.out.println("Libro " + titolo + " preso in prestito.");
    }

    private static void restituisciLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Inserisci il titolo del libro da restituire: ");
        String titolo = scanner.nextLine();
        biblioteca.restituisciLibro(titolo);
        System.out.println("Libro " + titolo + " restituito.");
    }

    private static void aggiungiLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Inserisci il titolo del nuovo libro: ");
        String titolo = scanner.nextLine();
        System.out.print("Inserisci l'autore del nuovo libro: ");
        String autore = scanner.nextLine();
        System.out.print("Inserisci l'anno di pubblicazione del nuovo libro: ");
        int anno = scanner.nextInt();
        System.out.print("Inserisci il numero di copie disponibili: ");
        int disponibili = scanner.nextInt();
        scanner.nextLine();
    
        biblioteca.aggiungiLibro(new Libro(titolo, autore, anno, disponibili));
        System.out.println("Nuovo libro aggiunto con successo!");
    }

    private static void rimuoviLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Inserisci il titolo del libro da rimuovere: ");
        String titolo = scanner.nextLine();
        biblioteca.rimuoviLibro(titolo);
        System.out.println("Libro " + titolo + " rimosso.");
    }

    private static void rimuoviUtente(Biblioteca biblioteca, Scanner scanner) {
        // System.out.print("Inserisci l'username dell'utente da rimuovere: ");
        // String username = scanner.nextLine();
        // // Logica per rimuovere l'utente
        // System.out.println("Utente " + username + " rimosso.");
        System.out.println("Presto Disponibile :)");
    }
}