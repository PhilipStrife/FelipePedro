/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prog Felipe
 */
public class Main {
    public static void main(String[] args) {
        TicketMachine tm = new TicketMachine(8);
        try {
            tm.inserir(40);
            System.out.println(tm.imprimir());
            System.out.println("Troco total");
            System.out.println(tm.getSaldo());
            System.out.println("Troco em notas");
          
            for (Iterator iterator = tm.getTroco(); iterator.hasNext();) {
                Object next = iterator.next();
                System.out.println(next.toString());
            }
        } catch (PapelMoedaInvalidaException | SaldoInsuficienteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
