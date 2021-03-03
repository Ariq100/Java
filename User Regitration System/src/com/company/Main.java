package com.company;

public class Main {

    public static void main(String[] args) {
        Registration r1 = new Registration("Ariq", "Ariq@gmail.com", "Ariq100", "Ariq12345");

        String email = r1.getEmail();

        r1.emailVerifier(email);

        String password = r1.getPassword();

        r1.passwordLengthChecker(password);

        r1.objectChecker();
    }
}