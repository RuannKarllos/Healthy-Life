package br.com.healthylife.exception;

public class DontExistisException extends Throwable {

    @Override
    public String toString() {
        return "Este ID nao consta em nossos registros, verifique se digitou corretamente!";
    }
    
    
}
