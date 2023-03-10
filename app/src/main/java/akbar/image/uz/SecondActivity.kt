package akbar.image.uz

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var img: ImageView
    private lateinit var btnBack: ImageView
    private lateinit var btnForward: ImageView

    private var index = 0

    private var list: MutableList<Int> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        loadViews()
        loadList()

        index = intent.getIntExtra("picture", 0)
        img.setImageResource(list[index])

        btnBack.setOnClickListener {
            if (index == 0) {
                index = list.size
            }
            index--
            img.setImageResource(list[index])
        }

        btnForward.setOnClickListener {
            if (index < list.size - 1) {
                index++
            } else {
                index = 0
            }
            img.setImageResource(list[index])
        }
    }

    private fun loadViews() {
        img = findViewById(R.id.extended)
        btnBack = findViewById(R.id.backBtn)
        btnForward = findViewById(R.id.forwardBtn)
    }

    private fun loadList() {
        list.add(R.drawable.img)
        list.add(R.drawable.imaga2)
        list.add(R.drawable.image3)
        list.add(R.drawable.image4)
        list.add(R.drawable.image5)
        list.add(R.drawable.image6)
    }
}