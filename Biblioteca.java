import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Utente> utenti = new ArrayList();
    private ArrayList<Utente> libri = new ArrayList();

    public void restituisciLibro(String titolo){
        for(Libro libro : libri){
            if(libro.getTitolo.equals(titolo.toLowerCase())){
                libro.restituisci();
            }
        }
    }

}


