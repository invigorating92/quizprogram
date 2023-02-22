package quiz.quizprogram.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuizAnswerDTO {

    private String question;

    private String answer;

    private String storeImageName;

    private String originalImageName;
}
