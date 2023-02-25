import javax.swing.JOptionPane;
public class Capicua {
    public static void main(String[] args) {
        int n,x,ultima,resultado=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        x=n;
        while (x!=0){
            ultima = x % 10;
            resultado = resultado * 10 + ultima;
            x = x / 10;}
            
            if(n == resultado){
                JOptionPane.showMessageDialog(null,"El numero "+n+" es capicua", "RESULTADO", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"El numero " + n +" no es capicua", "RESULTADO", JOptionPane.PLAIN_MESSAGE);
            }
    }
    
}
