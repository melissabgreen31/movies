package models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.swing.text.StyleConstants.Size;

/**
 * Created by melissagreen on 7/31/17.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull

    private String username;

    @NotNull
    private String password ;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
