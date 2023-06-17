package com.example.contactslist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contactslist.ContactData
import com.example.contactslist.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

//class  ContactAdapter(var contactList: List<ContactData>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
//
//
//
//    //    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ContactViewHolder{
//        val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//        return ContactViewHolder(binding)
//
//    }
//
//    override fun onBindViewHolder(holder:ContactViewHolder,position:Int){
//        val contact = contactList.get(position)
//        val binding=holder.binding
//        binding.ivAvatar.tag=contact.ImageResId
//        binding.tvName.text = contact.Name
//        binding.tvPhoneNumber.text = contact.PhoneNumber
//        binding.tvEmail.text = contact.Email
//
//        Picasso
//            .get()
//            .load(contact.ImageResId)
//            .resize(80, 80)
//            .centerCrop()
//            .into(binding.ivAvatar)
//    }
//
//    override fun getItemCount(): Int{
//        return contactList.size
//    }
//    class ContactViewHolder(var binding:ContactListItemBinding): ViewHolder(binding.root)
//}

class ContactAdapter(var contactList: List<ContactData>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList[position]
        val binding = (holder as ContactViewHolder).binding
        binding.ivAvatar.tag = contact.ImageResId
        binding.tvName.text = contact.Name
        binding.tvPhoneNumber.text = contact.PhoneNumber
        binding.tvEmail.text = contact.Email

        Picasso
            .get()
            .load(contact.ImageResId)
            .resize(80, 80)
            .centerCrop()
            .into(binding.ivAvatar)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ContactViewHolder(var binding: ContactListItemBinding) : RecyclerView.ViewHolder(binding.root)
}
