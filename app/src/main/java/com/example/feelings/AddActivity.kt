package com.example.feelings

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.text.format.DateUtils
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.feeling_record.*

class AddActivity : AppCompatActivity() {
    private var mood: Int = 2 //1 = sad, 2 = neutral, 3 = happy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        buttonSave.setOnClickListener{
            saveFeeling()
        }

        imageViewHappy.setOnClickListener {
            mood = 3
        }

        imageViewNeutral.setOnClickListener {
            mood = 2
        }

        imageViewSad.setOnClickListener {
            mood = 1
            //it.background.colorFilter...
        }
    }

    private fun saveFeeling(){
        val remark = editTextRemark.text
        //val dateCreated =
        val intent = Intent()
        intent.putExtra(EXTRA_MOOD, mood)
        intent.putExtra(EXTRA_REMARK, remark)

        setResult(Activity.RESULT_OK, intent)

        finish()
    }

    companion object{
        const val EXTRA_MOOD = ""
        const val EXTRA_REMARK = ""
    }
}
