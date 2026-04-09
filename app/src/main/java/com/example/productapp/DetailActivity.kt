/*
 * Course Code: MAD302
 * Lab Number: 2
 * Student Name: Ramandeep Singh
 * Student ID: A00194321
 * Date of Submission: April 9, 2026
 * Description: This activity receives product data from MainActivity using
 * Intent extras and displays the full product information safely.
 */

package com.example.productapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DetailActivity : AppCompatActivity() {

    private lateinit var tvDetailName: TextView
    private lateinit var tvDetailPrice: TextView
    private lateinit var tvDetailDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar: Toolbar = findViewById(R.id.detailToolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Product Details"

        toolbar.setTitleTextColor(getColor(android.R.color.white))
        toolbar.navigationIcon?.setTint(getColor(android.R.color.white))

        tvDetailName = findViewById(R.id.tvDetailName)
        tvDetailPrice = findViewById(R.id.tvDetailPrice)
        tvDetailDescription = findViewById(R.id.tvDetailDescription)

        val name = intent?.getStringExtra("name") ?: "No product name available"
        val price = intent?.getStringExtra("price") ?: "No price available"
        val description = intent?.getStringExtra("description") ?: "No description available"

        tvDetailName.text = name
        tvDetailPrice.text = price
        tvDetailDescription.text = description
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}