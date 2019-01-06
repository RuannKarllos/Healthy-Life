package br.com.healthylife.exception;

public class ErrorLoginException extends Throwable {

    @Override
    public String toString() {
        return "As senhas nao sao compativeis ou cliente ja foi cadastrado antes!";
    }
}
