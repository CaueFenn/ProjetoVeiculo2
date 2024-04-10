/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;
    
    public CarroPasseio(){
        this("", "");
    }

    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void leitura(){
        setCor(JOptionPane.showInputDialog("Digite a cor do carro : "));
        setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
    }
    
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null, toString());
    }

    @Override
    public String toString() {
        return "CarroPasseio{" + "cor=" + cor + ", modelo=" + modelo + '}';
    }
    
    
}
