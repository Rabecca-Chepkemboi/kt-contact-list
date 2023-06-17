package com.example.contactslist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactslist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
        override fun onResume() {
            super.onResume()
            contacts()
            binding.fabFloat.setOnClickListener {
                val intent = Intent(this,AddContacts::class.java)
                startActivity(intent)
            }
        }

      fun  contacts (){
       var detail1= ContactData("Mercy", "mercy@gmail.com", "+254789453", ImageResId = R.drawable.avatar)
        var detail2 = ContactData("Clarah", "clarah@gmail.com", "+2567894532", ImageResId = R.drawable.avatar)
        var detail3 = ContactData("Ann", "ann@gmail.com", "0785645342", ImageResId = R.drawable.avatar)
          var detail4 = ContactData("Daisy", "daisy@gmail.com", "074356287", ImageResId = R.drawable.avatar)
          var detail5 = ContactData("Morgan", "morgan@gmail.com", "073254760", ImageResId = R.drawable.avatar)
        var detail6 = ContactData("John", "john@gmail.com", "0712456789", ImageResId = R.drawable.avatar)
        var detail7 = ContactData(
            "Issabellah",
            "issabellah@gmail.com",
            "072536378",
            ImageResId = R.drawable.avatar
        )
        var detail8 = ContactData("Vince", "vince@gmail.com", "075649384", ImageResId = R.drawable.avatar)
        var detail9 = ContactData("Ambrose", "ambrose@gmai.com", "0798032356", ImageResId = R.drawable.avatar)
        var detail10 = ContactData("Samwel", "samwel@gmail.com", "0789457458", ImageResId = R.drawable.avatar)

var details = listOf(detail1, detail2, detail3, detail4, detail5,detail6, detail7, detail8, detail9, detail10)
          var ContactAdapter = ContactAdapter(details)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = ContactAdapter
    }
}