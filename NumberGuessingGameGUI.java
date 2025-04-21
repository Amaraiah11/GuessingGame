import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGuessingGameGUI extends JFrame implements ActionListener {
    JComboBox<String> difficultyBox;
    JTextField guessField;
    JLabel feedbackLabel, attemptsLabel, scoreLabel;
    JButton guessButton, restartButton;

    int numberToGuess;
    int maxRange;
    int maxAttempts;
    int attemptsLeft;
    int score;
    boolean gameActive;

    public NumberGuessingGameGUI() {
        setTitle("Number Guessing Game");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 1));

        difficultyBox = new JComboBox<>(new String[]{"Easy (1-50)", "Medium (1-100)", "Hard (1-200)"});
        add(new JLabel("Choose Difficulty:"));
        add(difficultyBox);

        guessField = new JTextField();
        add(new JLabel("Enter your guess:"));
        add(guessField);

        guessButton = new JButton("Guess");
        guessButton.addActionListener(this);
        add(guessButton);

        feedbackLabel = new JLabel(" ", SwingConstants.CENTER);
        add(feedbackLabel);

        attemptsLabel = new JLabel("Attempts left: ", SwingConstants.CENTER);
        add(attemptsLabel);

        scoreLabel = new JLabel("Score: 0", SwingConstants.CENTER);
        add(scoreLabel);

        restartButton = new JButton("Restart Game");
        restartButton.addActionListener(e -> startNewGame());
        add(restartButton);

        startNewGame();
        setVisible(true);
    }

    void startNewGame() {
        int selectedIndex = difficultyBox.getSelectedIndex();
        switch (selectedIndex) {
            case 0: maxRange = 50; maxAttempts = 10; break;
            case 1: maxRange = 100; maxAttempts = 7; break;
            case 2: maxRange = 200; maxAttempts = 5; break;
        }

        numberToGuess = new Random().nextInt(maxRange) + 1;
        attemptsLeft = maxAttempts;
        gameActive = true;

        feedbackLabel.setText("New game started! Guess the number.");
        attemptsLabel.setText("Attempts left: " + attemptsLeft);
        scoreLabel.setText("Score: " + score);  // Show cumulative score
        guessField.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        if (!gameActive) return;

        try {
            int guess = Integer.parseInt(guessField.getText());

            if (guess < 1 || guess > maxRange) {
                feedbackLabel.setText("Guess must be between 1 and " + maxRange);
                return;
            }

            attemptsLeft--;

            if (guess == numberToGuess) {
                score = attemptsLeft * 10;
                feedbackLabel.setText("Correct! You scored " + score + "!");
                gameActive = false;
            } else {
                if (guess < numberToGuess) {
                    feedbackLabel.setText("Too low!");
                } else {
                    feedbackLabel.setText("Too high!");
                }
                if (attemptsLeft == 0) {
                    feedbackLabel.setText("Out of attempts! The number was " + numberToGuess);
                    gameActive = false;
                }
            }

            attemptsLabel.setText("Attempts left: " + attemptsLeft);
            scoreLabel.setText("Score: " + score);

        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new NumberGuessingGameGUI();
    }
}
