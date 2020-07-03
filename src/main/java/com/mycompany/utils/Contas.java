
package com.mycompany.utils;


public class Contas {
    
    private int nCadeiraEcts;
    private double mediaPortal;
    private int nCreditosTotais;
    private double mediaSigai;
    
    public Contas(double mediaPortal, int nCreditosTotais, double mediaSigai, int nCadeirasEcts){
        this.mediaPortal = mediaPortal;
        this.nCreditosTotais = nCreditosTotais;
        this.mediaSigai = mediaSigai;
        this.nCadeiraEcts = nCadeirasEcts;
    }
    
    private double somaMediasFinal(){
        return mediaSigai * nCreditosTotais;
    }
    
    private double somaMediasAntiga(){
        return mediaPortal * (nCreditosTotais - nCadeiraEcts);
    }
    
    private double somaNotaASaber(){
        return somaMediasFinal() - somaMediasAntiga();
    }
    
    public double notaASaber(){
        return somaNotaASaber()/nCadeiraEcts;
    }
    
}
