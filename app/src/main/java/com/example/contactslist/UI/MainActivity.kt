package com.example.contactslist.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactslist.Model.ContactData
import com.example.contactslist.R
import com.example.contactslist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        displayContacts()
        binding.btnAdd.setOnClickListener {
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)
        }
    }

    fun displayContacts() {

        var nameA = ContactData(
        3,
        "https://plus.unsplash.com/premium_photo-1683141202259-ee13ddd953fc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
        "Clara",
        " clara@gmail.com",
        "+25476985896",        )
        var nameB = ContactData(
            7,
            "https://images.unsplash.com/photo-1517598024396-46c53fb391a1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlJTIwaW1hZ2VzfG",
            "Vince",
            "vince.com","+254123456787"
        )
        var nameC = ContactData(
            9,
            "https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Ambrose",
            "ambrose@gmail.com","+2541234567890"
        )
        var nameD = ContactData(
            8,
            "https://media.istockphoto.com/id/1444197522/photo/black-woman-green-makeup-and-face-on-skin-for-beauty-fashion-and-cosmetics-against-backdrop.webp?b=1&s=170667a&w=0&k=20&c=D59iE0OAckWbjLKKy9VRCgTgzcMfzQXeWvlLym3BVNU=",
            "Samwel",
            "samwel@gmail.com",
            "+254671234567"
        )
        var nameE = ContactData(
            4,
            "https://plus.unsplash.com/premium_photo-1683147627621-190cc667fd92?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "Esther",
            "esther@gmail.com",
            "+2548658745"
        )
        var nameF = ContactData(
            2,
            "https://images.unsplash.com/photo-1601821326018-d949a54b6402?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YmxhY2slMjBwZW9wbGUlMjBpbWFnZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q",
            "Morgan",
            "morgan@gmail.com","+254123456789"
        )
        var nameG= ContactData(
            11,
            "https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjJ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Daisy",
            "daisy@gmail.com",
            "+254971234567"
        )
        var nameH= ContactData(
            1,
            "https://images.unsplash.com/photo-1589156229687-496a31ad1d1f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjl8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Bridgit Mutesi",
            "bridgit@gmail.com",
            "+254912223456"
        )
        var nameI= ContactData(
            13,
            "https://images.unsplash.com/photo-1502685104226-ee32379fefbe?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Issabellah",
            "issabellah@gmail.com",
            "+254234986789"
        )
        var nameJ= ContactData(
            8,
            "https://images.unsplash.com/photo-1510736769521-207ed84f191e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "Thomas",
            "thomas@gmail.com",
            "+254968074567"
        )
        var names = listOf(nameA, nameB, nameC, nameD, nameE, nameF,nameG,nameH,nameI,nameJ)
        val contactAdapter = ContactsRvAdapter(names)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter    }
}