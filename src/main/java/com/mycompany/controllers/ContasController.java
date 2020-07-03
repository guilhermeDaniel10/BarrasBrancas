
package com.mycompany.controllers;

import com.mycompany.utils.Contas;

public class ContasController {
    
    private Contas contas;
    
    public void newContas(double mediaPortal, int nCreditosTotais, double mediaSigai, int nCadeirasEcts){
        this.contas = new Contas(mediaPortal, nCreditosTotais, mediaSigai, nCadeirasEcts);
    }
    
    public double getNotaASaber(){
        return contas.notaASaber();
    }
    
    
    
}
