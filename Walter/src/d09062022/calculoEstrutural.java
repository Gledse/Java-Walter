/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d09062022;

/**
 *
 * @author Gledse_Jamisse
 */
public class calculoEstrutural {
    private double altura;
    private double largura;
    private String unidadeMedicao;
    private String distribuida;
    private String pontual;

     public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public String getUnidadeMedicao() {
        return unidadeMedicao;
    }
    public void setUnidadeMedicao(String unidadeMedicao) {
        this.unidadeMedicao = unidadeMedicao;
    }
    
    public String getDistribuida() {
        return unidadeMedicao;
    }
    public void setDistribuida(String distribuida) {
        this.distribuida = distribuida;
    }
    
    public String getPontual() {
        return pontual;
    }
    public void setPontual(String pontual) {
        this.pontual = pontual;
    }
}
