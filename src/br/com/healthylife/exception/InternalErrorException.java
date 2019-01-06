package br.com.healthylife.exception;

public class InternalErrorException extends Throwable {

    @Override
    public String toString() {
        return "Ocorreu um erro interno.";
    }  
}
