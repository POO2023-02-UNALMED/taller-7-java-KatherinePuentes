package comunicacion;

public class Fabula extends Escrito{
    private String enseñanza;
    private String interpretacion;

    public Fabula(String enseñanza, String interpretacion){
        this.enseñanza= enseñanza;
        this. interpretacion= interpretacion;
    }

    public String getEnseñanza(){
        return enseñanza;
    }

    public void setEnseñanza(String enseñanza){
        this.enseñanza= enseñanza;
    }

    public String getInterpretacion(){
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion= interpretacion;
    }
}