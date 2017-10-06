package com.codeko.moments.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by nvcuong on 10/5/17.
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();
}
