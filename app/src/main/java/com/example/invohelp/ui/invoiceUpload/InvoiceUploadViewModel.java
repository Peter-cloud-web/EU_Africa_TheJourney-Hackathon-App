package com.example.invohelp.ui.invoiceUpload;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InvoiceUploadViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InvoiceUploadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}