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

    public void aggiungiLibro(Libro libro){
        for (Libro l:this.libri){
            if (l.getTitolo().equalsIgnoreCase(libro.getTitolo())){
                l.addLibro(libro.getDisponibili());
                return;
            }
        }
        this.libri.add(libro);
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

    public void aggiungiUtente(Utente aggiungi){
        for(Utente utente : utenti){
            if(aggiungi.getUsername().equals(utente.getUsername())){
                utenti.add(aggiungi);
            }
        }
    }

    public void stampaLibriDisponibili()
    {
        for (Libro libro : libri) 
        {
            System.out.println("Libro: " + libro.getTitolo() + " Autore: " + libro.getAutore() + " Anno: " + libro.getAnno());
            
        }
    }

    //verificacredenziali metodo
    public Utente verificaCredenziali(Utente utente) {
        for (Utente registrato : this.utenti) {
            if (registrato.getUsername().equals(utente.getUsername()) && registrato.getPassword().equals(utente.getPassword())) {
                return registrato;
            }
        }
        return null;
    }
}


