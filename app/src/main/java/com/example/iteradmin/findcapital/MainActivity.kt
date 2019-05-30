package com.example.iteradmin.findcapital

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val data = arrayOf("JHARKHAND","BIHAR","ODISHA","ANDHRA PRADESH","ARUNACHAL PRADESH",
            "ASSAM","CHATTISGARH","GOA","GUJRAT","HARYANA","HIMACHAL PRADESH","JAMMU AND KASHMIR",
            "KARNATAKA","KERALA","MADHYA PRADESH","MAHARASTRA","MANIPUR","MEGHALAYA","MIZORAM",
            "NAGALAND","PUNJAB","RAJASTHAN","SIKKIM","TAMIL NADU","TELANGANA","TRIPURA","UTTAR PRADESH",
            "UTTARAKHAND","WEST BENGAL")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val data2 = arrayOf("RANCHI", "PATNA", "BHUBANESWAR", "HYDERABAD", "ITANAGAR", "DISPUR", "RAIPUR",
                "PANAJI", "GANDHINAGAR", "CHANDINAGAR", "SHIMLA", "SRINAGAR", "BANGALURU", "TIRUVANTPURAM",
                "BHOPAL", "MUMBAI", "IMPHAL", "SHILONG", "AIZAWL", "KOHIMA", "CHANDIGARH", "JAIPUR", "GANGTOK",
                "CHENNAI", "HYDERABAD", "AGARTALA", "LUCKNOW", "DEHRADUN", "KOLKATA")
        val search = findViewById<AutoCompleteTextView>(R.id.search)

        val adp = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, data)
        search.setAdapter(adp)
        search.threshold = 0

        val text = findViewById<TextView>(R.id.text)

        search.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_LONG).show()
            //Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()
            val s: String = parent.getItemAtPosition(position).toString()
            val x: Int = getCapital(s)
            text.setText(data2[x])

        }
    }
        fun getCapital(state:String):Int{
            var x=0
            for (inn in data)
            {

                if (inn == state)
                {

                    /*Toast.makeText(this,data2[x].toString(),Toast.LENGTH_LONG).show()
                    text.setText(data2[x].toString())*/
                    return x
                }
                x++
            }
            return x
        }

}