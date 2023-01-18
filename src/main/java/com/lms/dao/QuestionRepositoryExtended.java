package com.lms.dao;


import com.lms.model.Question;

import java.util.List;

public interface QuestionRepositoryExtended {

    List<Question> findQuestionByExamId(String examId);
}
