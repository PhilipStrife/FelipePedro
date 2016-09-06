package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
 @Override
    public String getMessage() {
        return "SALDO INSUFICIENTE";
    }
}
