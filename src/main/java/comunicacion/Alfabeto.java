package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String[] letras, String interpretacion){
        this.letras= letras;
        this.interpretacion= interpretacion;
    }
}