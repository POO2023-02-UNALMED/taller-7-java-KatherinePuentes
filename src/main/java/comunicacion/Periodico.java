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
}