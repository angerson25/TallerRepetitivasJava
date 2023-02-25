import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int i,n,total;
        total=1;
        i=1;
        n= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a aplicar el factorial: "));
        
        while(i<=n){
            total=total*i;
            i++;



        } 
        JOptionPane.showMessageDialog(null,"El factorial del numero "+ n +" es : "+ total , "RESULTADO", JOptionPane.PLAIN_MESSAGE);
        
        

    }
    
}
