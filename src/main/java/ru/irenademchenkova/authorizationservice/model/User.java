package ru.irenademchenkova.authorizationservice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Objects;

public class User {
    @NotBlank
    @Size (min = 2)
    @Size (max = 15)
    private String user;
    @NotBlank
    @Size (min = 5)
    @Size (max = 20)
    private String password;

    private List<Authorities> authorities;

    public User(){
    }

    public User (String user, String password){
        this.user = user;
        this.password = password;
    }
    public User(String user, String password, List<Authorities> authorities) {
        this.user = user;
        this.password = password;
        this.authorities = authorities;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user1)) return false;
        return user.equals(user1.user) && password.equals(user1.password) && authorities.equals(user1.authorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        return "User " + user + " (password: " + password + ")";
    }
}
