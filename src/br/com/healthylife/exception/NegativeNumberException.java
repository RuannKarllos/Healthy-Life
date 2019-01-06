package br.com.healthylife.exception;

public class NegativeNumberException extends Throwable{

    @Override
    public String toString() {
        return "Esta sessao nao aceita valores negativos!";
    }
}
