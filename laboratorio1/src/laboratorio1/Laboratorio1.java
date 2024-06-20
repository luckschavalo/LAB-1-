/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario;
        String personal;
        personal = JOptionPane.showInputDialog("ingrese la cantidad de personal:");
//se solicita la cantidad de empeleados
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario:"));
//Pedimos el salario individual del personal
        Double salarioSem = salario * 0.0925;
// Al el salario base lo multiplicamos por el impuesto, en este caso el SEM
        Double salarioIvm = salario * 0.0934;
//Al el salario base lo multiplicamos por el impuesto, en este caso el IVM
        Double salarioTotal = salarioIvm + salarioSem;
        JOptionPane.showMessageDialog(null, "el salario base es =" + salario);
        //mostramos el salario base sin los impuestos
        JOptionPane.showInputDialog("La empresa deberá abonar a la CCSS el monto es" + salarioTotal, "por concepto SEM y IVM");
        //mostramos el salario final o total con los impuestos agregados
    }
}
