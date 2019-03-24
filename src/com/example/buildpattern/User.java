package com.example.buildpattern;

public class User {
    private String id;
    private String password;
    private int age;
    private String emailAddress;
    
    public User(String id, String password, int age, String emailAddress) {
        this.id = id;
        this.password = password;
        this.age = age;
        this.emailAddress = emailAddress;
        
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", password=" + password + ", age=" + age + ", emailAddress=" + emailAddress + "]";
    }

    public static class UserBuilder {
        // Essential parameters
        private final String id;
        private final String password;
        
        // Optional parameters
        private int age = 0;
        private String emailAddress = "defaultEmail@gmail.com";
        
        public UserBuilder(String id, String password) {
            this.id = id;
            this.password = password;
        }
        
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public UserBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        
        public User build() {
            User user = new User(id, password, age, emailAddress);
            return user;
        }
    }

    
}
