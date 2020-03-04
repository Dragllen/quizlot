package kz.knewit.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Question {
    private int id;
    private int categoryId;
    private int answerId;
    private String question;
    private boolean status;
}
