/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6q7;

/**
 *
 * @author yasmi
 */
public class Desafio6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     double valorCompra, bonus;
       
       for(cont=1; cont<=2;cont++){
           nome = JOptionPane.showInputDialog("Informe o nome POR FAVOR:");
           valorCompra = Double.parseDouble(JOptionPane.
                   showInputDialog("Agora informe o valor da compra no ano passado:"));
           if(valorCompra <= 500000){
               bonus = valorCompra * 0.1;
               perc = "10%";
           }else{
               bonus = valorCompra * 0.15;
               perc = "15%";
           }
           res = res + " "+nome+" - R$"+valorCompra
                   +" - obteve - "+perc+" no valor de R$ "+bonus+"\n";
           
       }
       JOptionPane.showMessageDialog(null, res);
    }
    
}
