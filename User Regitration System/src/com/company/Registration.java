package com.company;

public class Registration {
    private static int id;
    private String name;
    private String email;
    private String username;
    private String password;

    public Registration(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfo()
    {
        System.out.println(this.name);
        System.out.println(this.username);
        System.out.println(this.email);
    }

    public boolean passwordLengthChecker(String password)
    {
        int size = password.length();

        if (size > 8 && size < 16)
        {
//            System.out.println("Password is within the rules");
            System.out.print(true);
        }
        else
        {
//            System.out.println("Password length must be more than 8 characters and less than 16 characters ");
            System.out.print(false);
        }

        return false;
    }

    public void objectChecker()
    {
        int size = password.length();

        if(email.contains("@") && size > 8 && size < 16)
        {
            showInfo();
        }
    }

    public boolean emailVerifier(String email)
    {
        return (email.contains("@"))? true : false;

//        if (email.contains("@"))
//        {
////            System.out.println("\nYou email is valid");
//            System.out.print(true);
//        }
//
//        else
//        {
////            System.out.println("\nThe Email is not valid!!!\nEnter a valid email.");
//            System.out.print(false);
//        }
    }
}