package za.ac.iie.assigment1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputPartofDay = findViewById<EditText>(R.id.inputPartofDay)
        val btnsuggest = findViewById<Button>(R.id.btnsuggest)
        val btnrestart = findViewById<Button>(R.id.btnrestart)
        val txtsuggest = findViewById<TextView>(R.id.txtsuggest)

        btnsuggest.setOnClickListener {
            Log.d( "Button", "suggest button clicked")
            val timeOfDay = inputPartofDay.text.toString().trim().lowercase()
            Log.d( "Time of day", "User entered: $timeOfDay")

            var suggestion = "please enter a valid time of day (e.g morning, dinner "
            if (timeOfDay == "morning") {
                suggestion = "Try a egg wrap for breakfast !"
            } else if (timeOfDay == "mid-morning") {
                suggestion = "A yoghurt bowl is perfect!"
            } else if (timeOfDay == "afternoon") {
                suggestion = "Maybe have beef tacos for lunch"
            } else if (timeOfDay == "mid afternoon") {
                suggestion = "How about some cake?"
            } else if (timeOfDay == "dinner") {
                suggestion = "chicken alfredo pasta is a nice choice"
            } else if (timeOfDay == "after dinner") {
                suggestion = " ice cream is a perfect dessert"

            }


                txtsuggest.text = suggestion
                Log.d("Suggestion", "suggestion shown : $suggestion")

             btnrestart.setOnClickListener {
                 inputPartofDay.text.clear()
                 txtsuggest.text = "" // clear the suggestion
                 Log.d("Reset", "fields cleared")
             }



        }
    }
}