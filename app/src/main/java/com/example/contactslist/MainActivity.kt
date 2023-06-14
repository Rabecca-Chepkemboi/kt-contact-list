package com.example.contactslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contacts = mutableListOf(
            ContactData( "Mercy", "mercy@gmail.com", "+254789453", imageResId = R.drawable.avatar),
            ContactData("Clarah",  "clarah@gmail.com", "+2567894532", imageResId = R.drawable.avatar),
            ContactData("Ann","ann@gmail.com","0785645342", imageResId = R.drawable.avatar),
            ContactData("Daisy", "daisy@gmail.com", "074356287", imageResId = R.drawable.avatar),
            ContactData("Morgan", "morgan@gmail.com", "073254760", imageResId = R.drawable.avatar),
            ContactData("John", "john@gmail.com", "0712456789", imageResId = R.drawable.avatar),
            ContactData("Issabellah" ,"issabellah@gmail.com", "072536378", imageResId = R.drawable.avatar ),
            ContactData( "Vince", "vince@gmail.com",  "075649384", imageResId = R.drawable.avatar),
            ContactData("Ambrose", "ambrose@gmai.com", "0798032356", imageResId = R.drawable.avatar),
            ContactData( "Samwel", "samwel@gmail.com",  "0789457458", imageResId = R.drawable.avatar)
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactRVAdapter(contacts)
    }
}