import javax.swing.JOptionPane;
public class Main {

    static void Soma(float n1, float n2){
        JOptionPane.showMessageDialog(null, n1 + n2, "Soma", JOptionPane.INFORMATION_MESSAGE);
    }

    static void Subtrai(float n1, float n2){
        JOptionPane.showMessageDialog(null, n1 - n2, "Soma", JOptionPane.INFORMATION_MESSAGE);
    }

    static void Multiplica(float n1, float n2){
        JOptionPane.showMessageDialog(null, n1 * n2, "Soma", JOptionPane.INFORMATION_MESSAGE);
    }

    static void Divide(float n1, float n2){
        JOptionPane.showMessageDialog(null, n1 / n2, "Soma", JOptionPane.INFORMATION_MESSAGE);
    }

    static void Calculadora(String op, float n1, float n2){
        if (op.equals("+")){
            Soma(n1, n2);
        }
        if (op.equals("-")){
            Subtrai(n1, n2);
        }
        if (op.equals("*")){
            Multiplica(n1, n2);
        }
        if (op.equals("/")){
            Divide(n1, n2);
        }
    }
    public static void main(String[] args){
        String operador;
        float num1, num2;
       
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com um número"));
        operador = JOptionPane.showInputDialog("Entre com o operador");
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com um número"));   

        Calculadora(operador, num1, num2);
    }
}