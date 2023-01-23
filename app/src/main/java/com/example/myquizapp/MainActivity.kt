package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val btnstart : Button = findViewById(R.id.btn_start)
val name : TextView = findViewById(R.id.btn_name)
        btnstart.setOnClickListener {
    if (name.text.isEmpty()) {
        Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
    }
            else {
                // to move from one activity to other
                val intent = Intent(this,QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USER_NAME,name.text.toString())
        // to start second called activity
        startActivity(intent)
        // to finish the current activity
        finish()
    }
}
    }
}