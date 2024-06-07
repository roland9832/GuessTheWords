package com.example.guesstheword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class LetterFragment extends Fragment {

    private EditText editText;
    private TextView triesTextView;
    private int triesCount = 0;
    private String correctItem = "key"; // Change this to the correct item

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_letter, container, false);

        editText = rootView.findViewById(R.id.editTextText2);
        triesTextView = rootView.findViewById(R.id.textView2);

        rootView.findViewById(R.id.bottomNavigationView).setOnClickListener(view -> checkInput());

        return rootView;
    }

    private void checkInput() {
        String userInput = editText.getText().toString().trim();
        if (userInput.equalsIgnoreCase(correctItem)) {
            // Navigate to AlphabetFragment if correct
            Navigation.findNavController(requireView()).navigate(R.id.action_letterFragment_to_alphabetFragment);
        } else {
            // Increment tries count and update TextView
            triesCount++;
            updateTriesTextView();
        }
    }

    private void updateTriesTextView() {
        triesTextView.setText("Tries: " + toString(triesCount));
    }
}

