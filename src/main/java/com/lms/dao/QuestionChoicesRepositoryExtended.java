package com.lms.dao;


import com.lms.model.QuestionChoices;

public interface QuestionChoicesRepositoryExtended {

    QuestionChoices getChoiceByIdAndExamIdandQuestionId(String id, String examId, String questionId);
}
