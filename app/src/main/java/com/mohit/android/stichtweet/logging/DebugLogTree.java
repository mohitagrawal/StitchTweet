package com.mohit.android.stichtweet.logging;


import android.util.Log;

import timber.log.Timber;

public class DebugLogTree extends Timber.DebugTree {

    private static final int MAX_LOG_LENGTH = 4000;

    @Override
    protected boolean isLoggable(int priority) {
        if (priority == Log.VERBOSE) {
            return false;
        }

        // log WARN, ERROR, WTF, DEBUG, INFO
        return true;
    }

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        //this automatically puts log statement in EUM instrumentation pipeline. no more debug check
        if (isLoggable(priority)) {
            if (message.length() < MAX_LOG_LENGTH) {
                if (priority == Log.ASSERT) {
                    Log.wtf(tag, message);
                } else {
                    Log.println(priority, tag, message);
                }
            }
        }
    }

    @Override
    protected String createStackElementTag(StackTraceElement element) {
        return super.createStackElementTag(element) + " : " + element.getLineNumber();
    }
}
