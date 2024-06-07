package com.example.guesstheword

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the TextView with the id "twTapToPlay"
        val tapToPlay: View = findViewById(R.id.twTapToPlay)
        tapToPlay.setOnClickListener {
            // Use FragmentManager to replace the content of the container with the new fragment
            supportFragmentManager.commit {
                replace(R.id.fragment_container_view, HomeFragment())
                addToBackStack(null) // Optional: Add the transaction to the back stack
            }
        }
    }
}
