package com.example.assignment_2

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tV1.setOnClickListener {
            val options = arrayOf("Mihir Sarvaiya", "Jay Sorani", "Suketu Rola", "Aum Parmar")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("What is your name ?")
            builder1.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->  })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener{ dialog, which ->  })
            builder1.show()
        }

        binding.tV2.setOnClickListener {
            val options = arrayOf("220470116083", "220470116093", "220470116094", "220470116068")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Give me Your Enrollment Number")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->  })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->  })
            builder2.show()
        }

        binding.tV3.setOnClickListener {
            val options = arrayOf("Computer Networks", "Data Science", "Web Development", "Android Development")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which is your favourite subject ?")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->  })
            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->  })
            builder3.show()
        }

        binding.btnExit.setOnClickListener {
            val button = AlertDialog.Builder(this)
            button.setTitle("Do you really want to exit ?")
            button.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            button.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->  })
            button.show()
        }

    }
}