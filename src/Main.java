import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Throwable{

        System.out.println("Hier ist die Konsole. Willkommen!");

        System.out.println("... hier wird alles ausgegeben, was mit System.out oder System.err gegeben wird.");

        JOptionPane.showMessageDialog(new JFrame(), "Hi there, this is a dialog.");

        System.out.println("Und wir machen weiter mit der Konsole.");

        JOptionPane.showMessageDialog(new JFrame(), "Hi there, ich kann auch sprechen.");

        System.out.println("Wie viele Dialogs waren das?");

        System.out.println("Wie viele Konsole Zeilen?");
    }
}
