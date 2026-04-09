/*
 * Course Code: MAD302
 * Lab Number: 2
 * Student Name: Ramandeep Singh
 * Student ID: A00194321
 * Date of Submission: April 9, 2026
 * Description: This program displays a list of products using RecyclerView.
 * When the user taps a product, the app opens a detail screen and passes
 * product data using Intent extras.
 */

package com.example.productapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * MainActivity displays a product list using RecyclerView.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var productList: List<Product>

    /**
     * Called when the activity is created.
     * Sets up the RecyclerView, creates product data,
     * and handles product click navigation.
     *
     * @param savedInstanceState saved activity state
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewProducts)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productList = createProductList()

        // Lambda expression handles item click and opens DetailActivity.
        productAdapter = ProductAdapter(productList) { product ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", product.name)
            intent.putExtra("price", product.price)
            intent.putExtra("description", product.description)
            startActivity(intent)
        }

        recyclerView.adapter = productAdapter
    }

    /**
     * Creates a list of sample product data.
     *
     * @return list containing at least 6 products
     */
    private fun createProductList(): List<Product> {
        return listOf(
            Product(
                "Wireless Earbuds",
                "$59.99",
                "Bluetooth earbuds with noise isolation, charging case, and up to 20 hours of battery life."
            ),
            Product(
                "Smart Watch",
                "$129.99",
                "Fitness-focused smartwatch with heart-rate monitoring, sleep tracking, and message notifications."
            ),
            Product(
                "Portable Blender",
                "$34.99",
                "Rechargeable mini blender perfect for smoothies, shakes, and quick travel use."
            ),
            Product(
                "Laptop Stand",
                "$24.99",
                "Adjustable aluminum stand designed to improve posture and support better airflow for laptops."
            ),
            Product(
                "LED Desk Lamp",
                "$42.50",
                "Touch-control desk lamp with brightness levels, USB charging port, and eye-care lighting."
            ),
            Product(
                "Insulated Water Bottle",
                "$19.99",
                "Stainless steel bottle that keeps drinks cold for 24 hours and hot for 12 hours."
            )
        )
    }
}