package br.com.healthylife.exception;

public class InvalidOperationException extends Throwable {

    @Override
    public String toString() {
        return "Esta operacao nao pode ser concluida por falta de recursos.";
    }
}
