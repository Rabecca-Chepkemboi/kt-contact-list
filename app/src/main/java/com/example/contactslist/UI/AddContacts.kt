package com.example.contactslist.UI

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.contactslist.R
import com.example.contactslist.databinding.ActivityAddContactsBinding

class AddContacts : AppCompatActivity() {
    lateinit var binding: ActivityAddContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            validateAddContact()
        }
    }
    fun validateAddContact() {
        val name = binding.etFast.text.toString()
        val name2 = binding.etLast.text.toString()
        val phoneNumber = binding.etNumber.text.toString()
        val email = binding.etEmail.text.toString()

        var error = false
        if (name.isEmpty()) {
            binding.tillFast.error = "first_name_required"
            error = true
        }

        if (name.isEmpty()) {
            binding.tillLast.error = "last_name_required"
            error = true
        }

        if (name2.isEmpty()) {
            binding.tillEmail.error = "password_required "
            error = true
        }

        if (email.isEmpty()) {
            binding.tillNumber.error = "phone_number_required "
            error = true
        }

        if (!error) {
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)//            val newContacts= Contacts(0,name,phoneNumber,"email")
        }

        Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
        finish();
    }
}