package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        suṕer(origen);
        this.letras= letras;
        this.interpretacion= interpretacion;
    }

    public String[] getLetras(){
        return letras;
    }
    
    public void setLetras(String[] letras){
        this.letras= letras;
    }

    public String getInterpretacion(){
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion= interpretacion;
    }
}