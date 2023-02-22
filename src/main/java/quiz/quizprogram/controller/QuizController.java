package quiz.quizprogram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import quiz.quizprogram.dto.QuizAnswerDTO;

@Controller
public class QuizController {

    @GetMapping("/quiz/start")
    public String start(){

        return "startPage";
    }

    @GetMapping("/quiz/create")
    public String createQuiz(Model model){
        QuizAnswerDTO quizAnswerDTO = new QuizAnswerDTO();
        model.addAttribute("quizDTO", quizAnswerDTO);
        return "createQuiz";
    }

    @PostMapping("/quiz/create")
    public String createQuizPost(){

        return null;
    }
}
