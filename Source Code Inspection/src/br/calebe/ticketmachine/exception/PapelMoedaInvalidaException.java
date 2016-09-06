package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {

    @Override
    public String getMessage() {
        return "VOCE UTILIZOU UMA MOEDA INVALIDA";
    }
    
}
