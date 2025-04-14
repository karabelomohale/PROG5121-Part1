/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_part1.pkg3;
import java.util.regex.*;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String username;
    private String password;
    private String cellNumber;

    public boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            this.username = username;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPasswordComplexity(String password) {
        boolean isLongEnough = password.length() >= 8;
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*");

        if (isLongEnough && hasUppercase && hasDigit && hasSpecial) {
            this.password = password;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCellNumber(String cellNumber) {
        if (cellNumber.matches("^\\+27\\d{9}$")) {
            this.cellNumber = cellNumber;
            return true;
        } else {
            return false;
        }
    }

    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}
