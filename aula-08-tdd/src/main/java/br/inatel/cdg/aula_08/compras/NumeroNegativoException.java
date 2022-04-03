package br.inatel.cdg.aula_08.compras;

public class NumeroNegativoException extends Exception{

    // constrói um objeto NumeroNegativoException com a mensagem passada por parâmetro
    public NumeroNegativoException(String msg){
        super(msg);
    }

    // contrói um objeto NumeroNegativoException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public NumeroNegativoException(String msg, Throwable cause){
        super(msg, cause);
    }
}
