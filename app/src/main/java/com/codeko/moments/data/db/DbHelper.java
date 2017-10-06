package com.codeko.moments.data.db;

import com.codeko.moments.data.db.model.Option;
import com.codeko.moments.data.db.model.Question;
import com.codeko.moments.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by nvcuong on 10/5/17.
 */

public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();

    Observable<List<Question>> getAllQuestions();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> isOptionEmpty();

    Observable<Boolean> saveQuestion(Question question);

    Observable<Boolean> saveOption(Option option);

    Observable<Boolean> saveQuestionList(List<Question> questionList);

    Observable<Boolean> saveOptionList(List<Option> optionList);
}
