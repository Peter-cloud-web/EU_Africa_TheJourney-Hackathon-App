package com.example.invohelp.ui.donors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DonorsHistoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DonorsHistoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}