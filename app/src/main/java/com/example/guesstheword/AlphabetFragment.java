package com.example.guesstheword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class AlphabetFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_alphabet, container, false);

        // Receive the argument
        String buttonId = getArguments().getString("buttonId");

        // Now you can use the buttonId as needed

        return rootView;
    }
}
