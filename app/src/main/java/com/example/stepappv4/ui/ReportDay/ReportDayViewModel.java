package com.example.stepappv4.ui.ReportDay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class ReportDayViewModel {
    private final MutableLiveData<String> mText;

    public ReportDayViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
