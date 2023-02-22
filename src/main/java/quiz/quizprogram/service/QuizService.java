package quiz.quizprogram.service;

import org.springframework.stereotype.Service;
import quiz.quizprogram.dto.QuizAnswerDTO;
import quiz.quizprogram.entity.QuizAnswer;

@Service
public interface QuizService {
    QuizAnswerDTO entityToDto(QuizAnswer quizAnswer);

    QuizAnswer DtoToEntity(QuizAnswerDTO quizCreateDTO);
}
