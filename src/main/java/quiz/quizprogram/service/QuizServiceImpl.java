package quiz.quizprogram.service;

import org.springframework.stereotype.Component;
import quiz.quizprogram.dto.QuizAnswerDTO;
import quiz.quizprogram.entity.QuizAnswer;

@Component
public class QuizServiceImpl implements QuizService{
    @Override
    public QuizAnswerDTO entityToDto(QuizAnswer quizAnswer) {
        QuizAnswerDTO quizAnswerDTO = QuizAnswerDTO.builder()
                .question(quizAnswer.getQuestion())
                .answer(quizAnswer.getAnswer())
                .originalImageName(quizAnswer.getOriginalImageName())
                .storeImageName(quizAnswer.getStoreImageName())
                .build();
        return quizAnswerDTO;
    }

    @Override
    public QuizAnswer DtoToEntity(QuizAnswerDTO quizCreateDTO) {
        QuizAnswer quizAnswer = QuizAnswer.builder()
                .question(quizCreateDTO.getQuestion())
                .answer(quizCreateDTO.getAnswer())
                .originalImageName(quizCreateDTO.getOriginalImageName())
                .storeImageName(quizCreateDTO.getStoreImageName())
                .build();
        return quizAnswer;
    }
}
