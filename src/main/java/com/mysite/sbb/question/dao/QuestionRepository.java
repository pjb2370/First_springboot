package com.mysite.sbb.question.dao;

import com.mysite.sbb.question.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String s);

    List<Question> findAllBySubject(String s);

    List<Question> findAllBySubjectIn(List<String> searchWordList);

    List<Question> findBySubjectAndContent(String s, String s1);

    List<Question> findBySubjectLike(String s);
}