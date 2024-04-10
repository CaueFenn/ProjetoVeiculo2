/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
    private int toneladas;
    private int altura;
    private int comprimento;
    
    public Caminhao(){
        this(0,0,0);
    }

    public Caminhao(int toneladas, int altura, int comprimento) {
        this.toneladas = toneladas;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setToneladas(Integer.parseInt(JOptionPane.showInputDialog("Digite as toneladas: ")));
        setAltura(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura em metros: ")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento em metros: ")));
    }   
    
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null, toString());
    }

    @Override
    public String toString() {
        return "Caminhao{" + "toneladas=" + toneladas + ", altura=" + altura + ", comprimento=" + comprimento + '}';
    }
    
    
}
