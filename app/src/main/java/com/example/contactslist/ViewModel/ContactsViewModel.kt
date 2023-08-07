package com.example.contactslist.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactslist.Model.ContactData
import com.example.contactslist.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel() {

    val contactsRepo = ContactsRepository()
    fun saveContact(contact: ContactData){
        viewModelScope.launch {
            contactsRepo.saveContact(contact)
        }
    }
}