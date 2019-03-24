package com.example.buildpattern;

public class UserApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        User minsik = new User.UserBuilder("kmsik3","abcde")
                .setAge(19)
                .setEmailAddress("minsikEmail@gmail.com")
                .build();
        System.out.println(minsik);
        
        User ashley = new User.UserBuilder("Ashley", "xyz")
                .setAge(25)
                .setEmailAddress("AshleyEmail@gmail.com")
                .build();
        System.out.println(ashley);
        
        User optionalParameters = new User.UserBuilder("Option", "optionPW").build();
        System.out.println(optionalParameters);

    }

}
