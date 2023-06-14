package com.example.contactslist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRVAdapter (private val contactList: List<ContactData>) :
RecyclerView.Adapter<ContactRVAdapter.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactRVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ContactRVAdapter.ViewHolder, position: Int) {
        val contact = contactList[position]
//        var binding = holder.binding
        holder.itemView.findViewById<ImageView>(R.id.ivAvatar).setImageResource(contact.imageResId)
        holder.itemView.findViewById<TextView>(R.id.tvName).text = contact.firstName
        holder.itemView.findViewById<TextView>(R.id.tvEmail).text = contact.email
        holder.itemView.findViewById<TextView>(R.id.tvPhoneNumber).text = contact.phoneNumber
//        picasso.get().load(contact.image).resize(80, 80).into(binding.ivContact)
//            .centreCrop
    }
    override fun getItemCount(): Int{
        return contactList.size
    }

}
