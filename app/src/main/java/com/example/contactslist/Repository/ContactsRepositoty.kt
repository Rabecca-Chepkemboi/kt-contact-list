package com.example.contactslist.Repository

import com.example.contactslist.DataBase.ContactsDb
import com.example.contactslist.Model.ContactData
import com.example.contactslist.MyContactsApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDb.getDatabase(MyContactsApp.appContext)
    suspend fun saveContact(contact: ContactData){
//        switching to ui thread
        withContext(Dispatchers.IO){
            database.getContactDao().insertContact(contact)
        }
    }
}