package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        this.idea= idea;
        this. argumentos= argumentos;
        this.conclusion= conclusion;
        this.referencias= referencias;
        this.interpretacion= interpretacion;
    }
}