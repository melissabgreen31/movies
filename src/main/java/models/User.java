package models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sun.istack.internal.NotNull;

import java.util.List;

import static javax.swing.text.StyleConstants.Size;

/**
 * Created by melissagreen on 7/31/17.
 */
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String username;

    @NotNull
    @Size(min=1, message = "Please enter a password")
    private String password ;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
