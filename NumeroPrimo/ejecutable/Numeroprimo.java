import javax.swing.JOptionPane;
public class Numeroprimo {
    public static void main(String[] args) {
        int n,b;
        b=0; 
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0 ){
            b++;    
        }  
            
        }
        if(b!=2){
            JOptionPane.showMessageDialog(null,"El numero " + n + " no es primo", "RESULTADO", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero " + n + " es primo", "RESULTADO", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
