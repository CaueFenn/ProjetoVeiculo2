/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
public class Veiculo {
    private int peso;
    private int velocMax;
    private float preço;
    
    public Veiculo(){
        this(0, 0, 0);
    }

    public Veiculo(int peso, int velocMax, float preço) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preço = preço;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    
    public void leitura(){
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso em kg: ")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade em km/h: ")));
        setPreço(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço em R$: ")));
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, toString());
    }

    @Override
    public String toString() {
        return "Veiculo{" + "peso=" + peso + ", velocMax=" + velocMax + ", preço=" + preço + '}';
    }
    
    
    
}
