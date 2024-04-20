import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String s1, s2;
        s1 = JOptionPane.showInputDialog("S1: ");
        s2 = JOptionPane.showInputDialog("S2: ");

        s2 = s1;
        if (s1 == s2) { // isso dá muito ruim
            if (s1.equals(s2)) {
                System.out.println("Iguais");
            } else {
                System.out.println("Diferentes");
            }

            int num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

            int n = s1.length(); // Corrigido para usar s1.length()
            int[] a = new int[n];
        }
    }
}
