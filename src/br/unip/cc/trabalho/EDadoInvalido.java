package br.unip.cc.trabalho;

public class EDadoInvalido extends Exception{
    private static final long serialVersionUID = 1L;
    
    public EDadoInvalido(){
        super("Dado inválido");
    }
    
    public EDadoInvalido(String mensagem){
        super("\nDado inválido!" + mensagem);
    }
    
}
