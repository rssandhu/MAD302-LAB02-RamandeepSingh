/*
 * Course Code: MAD302
 * Lab Number: 2
 * Student Name: Ramandeep Singh
 * Student ID: A00194321
 * Date of Submission: April 9, 2026
 * Description: This adapter displays a list of products in a RecyclerView
 * and uses lambda-based click handling when a user taps a product.
 */

package com.example.productapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * RecyclerView adapter for displaying product data.
 *
 * @param productList list of products to display
 * @param onProductClick lambda function triggered when an item is clicked
 */
class ProductAdapter(
    private val productList: List<Product>,
    private val onProductClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    /**
     * Creates a new ViewHolder for a RecyclerView item.
     *
     * @param parent parent view group
     * @param viewType item view type
     * @return ProductViewHolder object
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }

    /**
     * Binds product data to a RecyclerView item.
     *
     * @param holder current ViewHolder
     * @param position item position in the list
     */
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product, onProductClick)
    }

    /**
     * Returns the total number of products.
     *
     * @return item count
     */
    override fun getItemCount(): Int = productList.size

    /**
     * ViewHolder class for product item views.
     *
     * @param itemView item layout view
     */
    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvName: TextView = itemView.findViewById(R.id.tvProductName)
        private val tvPrice: TextView = itemView.findViewById(R.id.tvProductPrice)
        private val tvDescription: TextView = itemView.findViewById(R.id.tvProductDescription)

        /**
         * Displays product data inside the item view and sets click handling.
         *
         * @param product selected product
         * @param onProductClick lambda click callback
         */
        fun bind(product: Product, onProductClick: (Product) -> Unit) {
            tvName.text = product.name
            tvPrice.text = product.price
            tvDescription.text = product.description

            // Lambda-based click handling for the current item.
            itemView.setOnClickListener {
                onProductClick(product)
            }
        }
    }
}