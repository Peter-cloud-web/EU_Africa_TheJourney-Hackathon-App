package com.example.invohelp.ui.authentication.authFragments.registration.donorRegistration;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.invohelp.R;

public class DonorRegistrationFragment extends Fragment {

    private DonorRegistrationViewModel mViewModel;

    public static DonorRegistrationFragment newInstance() {
        return new DonorRegistrationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.donor_registration_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DonorRegistrationViewModel.class);
        // TODO: Use the ViewModel
    }

}