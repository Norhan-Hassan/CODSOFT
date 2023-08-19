package Task3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM implements ActionListener {

    private JTextArea textArea;
    private JRadioButton withdrawingButton;
    private JRadioButton depositingButton;
    private JRadioButton checkingButton;
    private JButton chooseButton;
    private JButton retryButton;
    private BankAccount bankAccount;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ATM atm = new ATM();
            atm.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("ATM Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel topPanel = new JPanel();
        withdrawingButton = new JRadioButton("Withdraw");
        depositingButton = new JRadioButton("Deposit");
        checkingButton = new JRadioButton("Check balance");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(withdrawingButton);
        buttonGroup.add(depositingButton);
        buttonGroup.add(checkingButton);
        topPanel.add(withdrawingButton);
        topPanel.add(depositingButton);
        topPanel.add(checkingButton);

        JPanel centerPanel = new JPanel();
        textArea = new JTextArea(5, 20);
        centerPanel.add(textArea);

        JPanel bottomPanel = new JPanel();
        chooseButton = new JButton("Choose");
        chooseButton.setEnabled(false);
        retryButton = new JButton("Retry");
        retryButton.setEnabled(false);
        bottomPanel.add(chooseButton);
        bottomPanel.add(retryButton);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        withdrawingButton.addActionListener(e -> enableButtons());
        depositingButton.addActionListener(e -> enableButtons());
        checkingButton.addActionListener(e -> enableButtons());

        chooseButton.addActionListener(e -> {
            if (withdrawingButton.isSelected()) {
                String input = textArea.getText();
                String result = bankAccount.withdraw(Double.parseDouble(input));
                textArea.setText(result + "\n");
            } else if (depositingButton.isSelected()) {
                String input = textArea.getText();
                bankAccount.deposit(Double.parseDouble(input));
            } else if (checkingButton.isSelected()) {
                bankAccount.checkBalance();
                String result = bankAccount.checkBalance();
                textArea.setText(result + "\n");
            }
            disableButtons();
        });

        retryButton.addActionListener(e -> resetInterface());

        bankAccount = new BankAccount();

        frame.pack();
        frame.setVisible(true);
    }

    private void enableButtons() {
        textArea.setEditable(true);
        chooseButton.setEnabled(true);
        retryButton.setEnabled(true);
    }

    private void disableButtons() {
        textArea.setEditable(false);
        chooseButton.setEnabled(false);
        retryButton.setEnabled(true);
    }

    private void resetInterface() {
        withdrawingButton.setSelected(false);
        depositingButton.setSelected(false);
        checkingButton.setSelected(false);
        textArea.setText("");
        textArea.setEditable(false);
        chooseButton.setEnabled(false);
        retryButton.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
}
