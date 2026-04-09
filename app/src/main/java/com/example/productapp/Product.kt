/*
 * Course Code: MAD302
 * Lab Number: 2
 * Student Name: Ramandeep Singh
 * Student ID: A00194321
 * Date of Submission: April 9, 2026
 * Description: This file defines the Product data class used to store
 * product information such as name, price, and description.
 */

package com.example.productapp

/**
 * Product data class used to represent a single product item.
 *
 * @property name product name
 * @property price product price
 * @property description full product description
 */
data class Product(
    val name: String,
    val price: String,
    val description: String
)