import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        // Instantiation
        figureItOut func = new figureItOut();


        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a NUMBER guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, figureItOut.figureItOutComputer(userAnswer, computerNumber, count));
            count++;
        }
    }

}
