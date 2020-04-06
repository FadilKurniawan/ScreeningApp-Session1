package com.devfk.ma.screeningapp.ui.Adapter

import com.devfk.ma.screeningapp.data.Model.Guest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.devfk.ma.screeningapp.R


class GuestAdapter(nameItem: ArrayList<Guest>) : BaseAdapter(){
    private val item = nameItem

    @SuppressLint("ViewHolder")
    override fun getView(position:Int, convertView: View?, parent: ViewGroup?):View{
        // Inflate the custom view
        val inflater = parent?.context?.
            getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view    = inflater.inflate(R.layout.grid_item,null)
        // Get the custom view widgets reference
        val name = view.findViewById<TextView>(R.id.txvNameGuest)

        name.text = item[position].name

        return view
    }

    override fun getItem(position: Int): Any? {
        return item[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    // Count the items
    override fun getCount(): Int {
        return item.size
    }

}