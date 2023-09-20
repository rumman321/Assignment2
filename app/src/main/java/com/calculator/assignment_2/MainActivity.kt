package com.calculator.assignment_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var passord:EditText
    private lateinit var passord2:EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.t1)
        email = findViewById(R.id.t2)
        passord = findViewById(R.id.t3)
        passord2 = findViewById(R.id.t4)
        button = findViewById(R.id.b1)

        button.setOnClickListener {
            var nm=name.getText().toString()
            var em=email.getText().toString()
            var ps:String=passord.getText().toString()
            var pas:String=passord2.getText().toString()
            var intent=Intent(this,secondphage::class.java)

            intent.putExtra("name",nm)
            intent.putExtra("email",em)
            intent.putExtra("pass",ps)
            intent.putExtra("pass2",pas)


            startActivity(intent)
        }
    }
}