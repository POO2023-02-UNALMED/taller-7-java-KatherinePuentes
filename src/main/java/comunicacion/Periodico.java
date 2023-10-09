package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String fecha, String primicia, String interpretacion){
        this.fecha= fecha;
        this.primicia= primicia;
        this.interpretacion= interpretacion;
    }
}