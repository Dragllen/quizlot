package kz.knewit.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int id;  // Long
    private String login;
    private String password;
    private String name;
    private boolean isAdmin;
}
