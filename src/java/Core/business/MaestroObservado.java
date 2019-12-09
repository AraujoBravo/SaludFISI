/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core.business;

import java.util.ArrayList;

/**
 *
 * @author JuanEAB
 */
public class MaestroObservado implements IObservado{
    private ArrayList<IObservador> observadores = new ArrayList<>();
    private boolean cambio;
    private final Object MUTEX = new Object();
    private String[] mensajeActual;
    
    @Override
    public void addObservador(IObservador observador) {
        if(observador == null) throw new NullPointerException("Observador nulo");
        synchronized(MUTEX){
            if(!observadores.contains(observador))
                observadores.add(observador);
        }
    }

    @Override
    public void removeObservador(IObservador observador) {
        synchronized(MUTEX){
            observadores.remove(observador);
        }
    }

    @Override
    public void notificar() {
        ArrayList<IObservador> observadoresLocal = null;
        synchronized(MUTEX){
            if(!cambio)
                return;
            observadoresLocal = new ArrayList<>(this.observadores);
            this.cambio = false;
        }
        for(IObservador observador: observadoresLocal){
            observador.update();
        }
    }

    @Override
    public String[] getUpdate(IObservador observador) {
        return this.mensajeActual;
    }

    @Override
    public void postMensaje(){
        this.cambio = true;
        notificar();
    }
}
