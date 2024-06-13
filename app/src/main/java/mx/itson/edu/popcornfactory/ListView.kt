package mx.itson.edu.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        setupButton(1, R.id.image_drhouse, "Dr.House")
        setupButton(2, R.id.image_smallville, "Smallville")
        setupButton(3, R.id.image_drwho, "Dr.Who")
        setupButton(4, R.id.image_bones, "bones")
        setupButton(5, R.id.image_suits, "Suits")
        setupButton(6, R.id.image_friends, "Friends")
        setupButton(7, R.id.milnueve, "1917")
        setupButton(8, R.id.image_bighero, "Big Hero 6")
        setupButton(9, R.id.image_leapyear, "Leap Year")
        setupButton(10, R.id.image_meninblack, "Men In Black")
        setupButton(11, R.id.image_toystory, "Toy Story")
        setupButton(12, R.id.image_inception, "Inception")
    }

    private fun setupButton(id: Int, buttonId: Int, movieName: String) {
        val button = findViewById<ImageView>(buttonId)
        button.setOnClickListener { v: View? ->
            val intent: Intent = Intent(
                this@ListView,
                Header::class.java
            )
            intent.putExtra("ID", id)
            intent.putExtra("MOVIE_NAME", movieName)
            startActivity(intent)
        }
    }

}