package se.lexicon;

import java.util.Objects;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        this.role = role;
    }

    //Constructor
    public AppUser(String username, String password, AppRole role){
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    // create toString() method overridden from object class
    @Override
    public String toString() {
        return "AppUser {" + "username= " + username + ", role= " + role + "}";
    }

    // create hashCode() method overridden from object class
    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }


    // create equals() method overridden from object class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) &&
                Objects.equals(password, appUser.password) &&
                role == appUser.role;
    }


}
