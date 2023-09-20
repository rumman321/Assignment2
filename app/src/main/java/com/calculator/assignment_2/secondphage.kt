package com.calculator.assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondphage : AppCompatActivity() {
    private lateinit var name:TextView
    private lateinit var email:TextView
    private lateinit var pass:TextView
    private lateinit var pass2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondphage)

        name = findViewById(R.id.text)
        email = findViewById(R.id.text1)
        pass = findViewById(R.id.text2)
        pass2 = findViewById(R.id.text3)

        name.setText(intent.getStringExtra("name"))
        email.setText(intent.getStringExtra("email"))
        pass.setText(intent.getStringExtra("pass"))
        pass2.setText( intent.getStringExtra("pass2"))


    }
}