package com.example.contextmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt1=findViewById(R.id.txt1) as TextView
        registerForContextMenu(txt1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.mymenu,menu);

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        //return super.onContextItemSelected(item)
        when(item.itemId)
        {
         R.id.Cut->{
            Toast.makeText(this,"Cut Selected",
                Toast.LENGTH_LONG).show()
         }
        }
        return true;
    }
}