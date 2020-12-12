package com.example.invohelp.ui.invoiceUpload;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.invohelp.R;

public class InvoiceUploadFragment extends Fragment implements View.OnClickListener {
    Button submit;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_upload_invoice, container, false);
        submit = root.findViewById(R.id.submit);
        submit.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        if(v==submit){
            showToast();
        }
    }

    public void showToast(){
        Toast.makeText(getActivity(), "Successfully submitted", Toast.LENGTH_SHORT).show();
    }
}