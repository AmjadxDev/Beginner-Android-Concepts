package com.amjadxdev.beginnerstoadvanced.alertdialog

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityAlertDialogBinding

class AlertDialogActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityAlertDialogBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.showDialog.setOnClickListener {
            showAlertDialog()
        }



    }

    private fun showAlertDialog() {
        val builder = AlertDialog.Builder(this@AlertDialogActivity)
        builder.setTitle("Exit Dialog")
            .setMessage("Are you sure to exit")
            .setPositiveButton("Yes"){dialog, which ->
                Toast.makeText(this@AlertDialogActivity, "Click yes", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") {dialog, which ->
                Toast.makeText(this@AlertDialogActivity, "Click no", Toast.LENGTH_SHORT).show()
            }

        val alertDialog : AlertDialog = builder.create()
        alertDialog.show()

    }
}