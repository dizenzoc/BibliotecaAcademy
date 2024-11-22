public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Scanner scInt = new Scanner (System.in);

        Biblioteca biblioteca = new Biblioteca();

        // utenti di esempio
        biblioteca.aggiungiUtente(new Utente("admin", "password123"));
        biblioteca.aggiungiUtente(new Utente("user1", "pass1"));
        
        // richiesta di username e password
        System.out.println("Benvenuto nel Sistema! per proseguire sei pregato di effettuare il login...")
        System.out.print("Inserisci username: ");
        String username = scanner.nextLine();
        System.out.print("Inserisci password: ");
        String password = scanner.nextLine();

         // Verifica del login
         Utente utente = biblioteca.verificaCredenziali(username, password);
         if (utente != null) {
            System.out.println("Login effettuato con successo!");
            // Mostra il menu
            boolean menu = true;
            while (menu) {
                mostraMenu();

                int scelta = scInt.nextInt();
                scInt.nextLine(); 

                switch (scelta) {
                    case 1:
                        //
                        break;
                    case 2:
                        //
                        break;
                    case 3:
                        //
                        break;
                    case 4:
                        //
                        break;
                    case 5:
                        //
                        break;
                    case 6:
                        //
                        break;
                    case 7:
                        //
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

         scInt.close();
         scanner.close();
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

}