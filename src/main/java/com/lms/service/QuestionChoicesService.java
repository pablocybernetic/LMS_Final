package com.lms.service;

import com.lms.model.QuestionChoices;

public interface QuestionChoicesService {

    QuestionChoices getChoiceByIdAndExamIdandQuestionId(String id, String examId, String questionId);
}
