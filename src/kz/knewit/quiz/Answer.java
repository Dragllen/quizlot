package kz.knewit.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Answer {
    private int id;
    private String correct;
    private String wrong1;
    private String wrong2;
}
