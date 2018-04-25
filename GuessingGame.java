import javax.swing.JFrame;
//created from Learn Java the Easy Way by Bryson Payne
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	private int numberOfTries = 0;
	JButton playAgain;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		try {
			int guess = Integer.parseInt(guessText);
			numberOfTries++;
			if (guess < theNumber)
				message = guess + " is too low, try again";
			if (guess > theNumber)
				message = guess + " is too high, try again";
			else {
				message = guess + " is correct!  Great Job. " + "It took you " + numberOfTries + " time(s)";
				playAgain.setVisible(true);
				}
		} catch (Exception e) {
			message = "Enter a whole number between 1 and 100";
		} finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
	}
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
		playAgain.setVisible(false);
		numberOfTries = 0;
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Nick's Guessing Game");
		getContentPane().setLayout(null);

		JLabel lblNicksHiloGame = new JLabel("Nick's HiLo Game");
		lblNicksHiloGame.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNicksHiloGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblNicksHiloGame.setBounds(95, 39, 152, 14);
		getContentPane().add(lblNicksHiloGame);

		JLabel lblEnterANumber = new JLabel("Enter a number between 1 and 100");
		lblEnterANumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterANumber.setBounds(57, 92, 229, 14);
		getContentPane().add(lblEnterANumber);

		txtGuess = new JTextField();
		txtGuess.setBounds(302, 89, 86, 20);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);

		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(127, 145, 89, 23);
		getContentPane().add(btnGuess);

		lblOutput = new JLabel("Enter a number above and hit Guess!");
		lblOutput.setBounds(82, 207, 236, 14);
		getContentPane().add(lblOutput);
		
		playAgain = new JButton("Play again?");
		playAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		playAgain.setBounds(299, 173, 89, 23);
		getContentPane().add(playAgain);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
	}
}
