/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part1;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Main {
    public static void main(String[] args) {
        Login login = new Login();

        // User details
        String firstName = JOptionPane.showInputDialog("Enter your first name:");
        String lastName = JOptionPane.showInputDialog("Enter your last name:");

        String username = JOptionPane.showInputDialog("Enter a username (must include _ and max 5 characters):");
        while (!login.checkUsername(username)) {
            username = JOptionPane.showInputDialog("Invalid username. Please enter a username that contains an underscore and is no more than 5 characters long:");
        }
        JOptionPane.showMessageDialog(null, "Username successfully captured.");

        String password = JOptionPane.showInputDialog("Enter a password (8+ chars, capital letter, number, special char):");
        while (!login.checkPasswordComplexity(password)) {
            password = JOptionPane.showInputDialog("Invalid password. Please enter a password with at least 8 characters, a capital letter, a number, and a special character:");
        }
        JOptionPane.showMessageDialog(null, "Password successfully captured.");

        String cell = JOptionPane.showInputDialog("Enter your South African phone number (must start with +27):");
        while (!login.checkCellNumber(cell)) {
            cell = JOptionPane.showInputDialog("Invalid cell number. Please enter a number starting with +27 and followed by 9 digits:");
        }
        JOptionPane.showMessageDialog(null, "Cell phone number successfully captured.");

        //Login 
        String loginUser = JOptionPane.showInputDialog("Log in - Enter your username:");
        String loginPass = JOptionPane.showInputDialog("Log in - Enter your password:");

        if (login.loginUser(loginUser, loginPass)) {
            JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName + ", it is great to see you again.");
        } else {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
        }
    }
}
