/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import model.Caminhao;
import model.CarroPasseio;
import model.Veiculo;

public class Principal {
    public static void main (String[] args){
        Veiculo vei = new Veiculo();
        vei.leitura();
        vei.imprimir();
        
        CarroPasseio cp = new CarroPasseio();
        cp.leitura();
        cp.imprimir();
        
        Caminhao cam = new Caminhao();
        cam.leitura();
        cam.imprimir();
        
        
        
        
    }
}
