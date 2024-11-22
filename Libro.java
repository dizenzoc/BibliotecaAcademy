public class Libro {
    
    private String titolo;
    private String autore;
    private int anno;
    private int disponibili;
    private int prestati;

    public Libro(String titolo, String autore, int anno)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }

    public void setAutore(String autore)
    {
        this.autore = titolo;
    }

    public void setAnno(int anno)
    {
        this.anno = anno;
    }


    public String getTitolo()
    {
        return titolo;
    }

    public String getAutore()
    {
        return autore;
    }

    public int getAnno()
    {
        return anno;
    }



    public void presta()
    {
        if(disponibili > 0)
        {
            disponibili--;
            prestati++;
        }else
        {
            System.out.println("Non ci sono abbasstanza libri");
        }
    }

    public void restituisci()
    {
        if(prestati > 0)
        {
            prestati--;
            disponibili++;
        }else
        {
            System.out.println("Non puoi restituire il libro, in quanto non è stato prestato!");
        }

    }
}
