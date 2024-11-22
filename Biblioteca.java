import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Utente> utenti = new ArrayList();
    private ArrayList<Libro> libri = new ArrayList();


    public void prestaLibro(String titolo){
        boolean flag = true;
        for (Libro tmp:this.libri){
            if (tmp.getTitolo().toLowerCase().equals(titolo.toLowerCase())){
                tmp.presta();
                flag = false;
            }
        }
        if (flag){
            System.out.println("\nLibro non trovato in biblioteca.");
        }
    }

    public void aggiungiLibro(String titolo, String autore, int quantità){
        for (Libro l:this.libri){
            if (l.getTitolo().equalsIgnoreCase(titolo)){
                l.addLibro(quantità);
                return;
            }
        }
        Libro tmp = new Libro(titolo, autore, quantità);
        this.libri.add(tmp);
    }
    
    public void restituisciLibro(String titolo){
        for(Libro libro : libri){
            if(libro.getTitolo().equals(titolo.toLowerCase())){
            if(libro.getTitolo().equals(titolo.toLowerCase())){
                libro.restituisci();
            }
        }
    }
}

    public void rimuoviLibro(String titolo){
        for(Libro libro : libri){
            if(libro.getTitolo().equals(titolo.toLowerCase())){
                libro.rimuoviLibro();
            }
        }
    }

    public void aggiungiUtente(String username, String password){
        for(Utente utente : utenti){
            if(utente.getUsername().equals(username)){
                Utente utente = new Utente(username, password);
                utenti.add(utente);
            }
        }
    }

    public void stampaLibriDisponibili()
    {
        for (Libro libro : libri) 
        {
            System.out.println("Libro: " + libro.getTitolo());
            
        }
    }
    //verificacredenziali metodo

}


