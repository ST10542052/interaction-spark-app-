package com.example.interactionsparkapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

                val timeInput = findViewById<EditText>(R.id.edtTime)
                val btnReset = findViewById<Button>(R.id.btnReset)
                val edtSuggestion = findViewById<TextView>(R.id.edtSuggestion)
                val btnSuggestion = findViewById<Button>(R.id.btnSuggestion)

                btnSuggestion.setOnClickListener {
                    //suggestion validation
                    val time = timeInput.text.toString().trim().lowercase()
                    if (time.isEmpty()) {
                        edtSuggestion.text = "Please enter valid suggestion"

                        //Suggestions
                    } else if (time == "morning") {
                        edtSuggestion.text = "Send a 'Good morning' text to a family member"
                    } else if (time == "mid-morning") {
                        edtSuggestion.text = "Reach out to a colleague with a quick 'Thank you'"
                    } else if (time == "afternoon")
                        edtSuggestion.text = "Share a funny meme or interesting link with a friend"
                    else if (time == "afternoon snack time") {
                        edtSuggestion.text = "Send a quick 'Thinking of you' message"
                    }else if (time=="dinner") {
                        edtSuggestion.text = "Call a friend or relative for a 5-minute catch up"
                    }else if (time=="night") {
                        edtSuggestion.text = "Leave a thoughtful comment on a friend's post"
                    } else {
                        edtSuggestion.text = "Try:morning, mid-morning, afternoon, afternoon snack time, dinner or night."
                    }

                    //This clears the page
                    btnReset.setOnClickListener {
                        timeInput.text.clear()
                        edtSuggestion.text = "Suggestion will appear here"
                        val resultText = null

                        //This gives quick feedback to the user
                        //Source: https://www.digitalocean.com/community/tutorials/android-snackbar-example-tutorial
                        Snackbar.make(it, "Ready for a suggestion!", Snackbar.LENGTH_LONG).show()


                    }
                }
            }
        }



