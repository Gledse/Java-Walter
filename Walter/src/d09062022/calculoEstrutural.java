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
    private double carga;
    private double Mmax;
    private double Ra;
    private double altura;
    private double largura;
    private String unidadeMedicao;
    private String distribuida;
    private String pontual;
    private String direção;
    

    /*public double getMmax() {
        return Mmax;
    }
    public double getRa() {
        return Ra;
    }
    */
    public double getCarga() {
        return carga;
    }
    public double getAltura() {
        return altura;
    }
    public double getLargura() {
        return largura;
    }
    public String getUnidadeMedicao() {
        return unidadeMedicao;
    }
    public String getDistribuida() {
        return unidadeMedicao;
    }
    public String getPontual() {
        return pontual;
    }
    public String getDireção() {
        return direção;
    }
    
    public void setCarga(double carga) {
        this.carga = carga;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void setUnidadeMedicao(String unidadeMedicao) {
        this.unidadeMedicao = unidadeMedicao;
    }
    public void setDistribuida(String distribuida) {
        this.distribuida = distribuida;
    }
    public void setPontual(String pontual) {
        this.pontual = pontual;
    }
    public void setDireção(String direção) {
        this.direção = direção;
    }
    /*
    public void setMmax(double Mmax) {
        this.Mmax = Mmax;
    }
    public void setRa(double Ra) {
        this.Ra = Ra;
    }
    */
}
