package com.codeko.moments.data.db;

import com.codeko.moments.data.db.model.Option;
import com.codeko.moments.data.db.model.Question;
import com.codeko.moments.data.db.model.User;

import java.util.List;

import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by nvcuong on 10/5/17.
 */

@Singleton
public class AppDbHelper implements DbHelper{
    @Override
    public Observable<Long> insertUser(User user) {
        return null;
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return null;
    }

    @Override
    public Observable<List<Question>> getAllQuestions() {
        return null;
    }

    @Override
    public Observable<Boolean> isQuestionEmpty() {
        return null;
    }

    @Override
    public Observable<Boolean> isOptionEmpty() {
        return null;
    }

    @Override
    public Observable<Boolean> saveQuestion(Question question) {
        return null;
    }

    @Override
    public Observable<Boolean> saveOption(Option option) {
        return null;
    }

    @Override
    public Observable<Boolean> saveQuestionList(List<Question> questionList) {
        return null;
    }

    @Override
    public Observable<Boolean> saveOptionList(List<Option> optionList) {
        return null;
    }
}
