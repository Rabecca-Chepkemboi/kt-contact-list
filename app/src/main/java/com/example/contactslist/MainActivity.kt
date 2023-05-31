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
            ContactData( "Lyne", "johndoe@example.com", "+254789453", imageResId = R.drawable.avatar),
            ContactData("Irene",  "irenemusembi@gmail.com", "+2567894532", imageResId = R.drawable.avatar),
            ContactData("Mercy","yvonne@gmail.com","0785645342", imageResId = R.drawable.avatar),
            ContactData("Rose" ,"Ann", "annkelly@gmail.com", imageResId = R.drawable.avatar ),
            ContactData( "Willy", "willysifuna@gmail.com",  "075649384", imageResId = R.drawable.avatar),
            ContactData("Eunice", "eunicemusembi@gmai.com", "0798032356", imageResId = R.drawable.avatar),
            ContactData( "Daniel", "musembidaniel@gmail.com",  "0789457458", imageResId = R.drawable.avatar)
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactRVAdapter(contacts)
    }
}