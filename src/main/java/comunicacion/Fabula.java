package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza= ensenanza;
        this. interpretacion= interpretacion;
    }

    public String getEnsenanza(){
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza){
        this.ensenanza= ensenanza;
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
        return String.format("%s\n%s\n%s\n%d\n%s", getOrigen(), getTitulo(), getAutor(), getPaginas(), ensenanza);
    }

    @override
    public int palabrasTotales(int palabrasPagina){
        return getPaginas()* palabrasPagina* 1;
    }
}