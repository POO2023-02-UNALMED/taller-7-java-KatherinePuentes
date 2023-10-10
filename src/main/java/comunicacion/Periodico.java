package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha= fecha;
        this.primicia= primicia;
        this.interpretacion= interpretacion;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha= fecha;
    }

    public String getPrimicia(){
        return primicia;
    }

    public void setPrimicia(String primicia){
        this.primicia= primicia;
    }

    public String getInterpretacion(){
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion= interpretacion;
    }

    @override
    public String interpretacion(){
        return interpretacion;
    }

    @override
    public string toString(){
        return String.format("%s\n%s\n%s\n%d\n%s\n%s", getOrigen(), getTitulo(), getAutor(), getPaginas(), fecha, primicia);
    }
}