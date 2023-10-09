package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro( String co_autor, String editorial, String edicion, String interpretacion){
        this.co_autor= co_autor;
        this.editorial= editorial;
        this.edicion= edicion;
        this.interpretacion= interpretacion;
    }
}