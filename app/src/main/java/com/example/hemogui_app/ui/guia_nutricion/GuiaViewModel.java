package com.example.hemogui_app.ui.guia_nutricion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GuiaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GuiaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}