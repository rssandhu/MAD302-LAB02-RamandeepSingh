# Product App Assignment

## Overview
This Android application is built in Kotlin and displays a list of products using a RecyclerView with a custom adapter. When the user taps a product, the app navigates to a detail screen and shows the full product information using Intent extras with null-safe handling. 

## Features
- Displays at least 6 products with name, price, and description.
- Uses RecyclerView with a custom adapter. 
- Implements lambda-based click handling for product selection. 
- Navigates from `MainActivity` to `DetailActivity` using Intent. 
- Passes product data between screens using Intent extras. 
- Uses Kotlin null safety when receiving data in the detail screen.
- Displays full product details on the second screen. 

## Project Structure
- `MainActivity.kt` - Displays the product list using RecyclerView.
- `ProductAdapter.kt` - Custom adapter for binding product data to RecyclerView items.
- `Product.kt` - Data class for storing product information.
- `DetailActivity.kt` - Displays full details of the selected product.
- `activity_main.xml` - Layout for the main product list screen.
- `item_product.xml` - Layout for each product item in the RecyclerView.
- `activity_detail.xml` - Layout for the product detail screen.
- `AndroidManifest.xml` - Declares app activities and navigation.

## How It Works
1. The app starts in `MainActivity`.
2. A list of products is created and shown in a RecyclerView.
3. The custom adapter binds each product to an item layout. 
4. When the user taps a product, a lambda click listener sends the product data to `DetailActivity`.
5. `DetailActivity` receives the data safely and displays the full product information. 

## Requirements Completed
- RecyclerView with custom adapter
- At least 6 products
- Click handling with lambda
- Navigation using Intent
- Data passing between screens
- Null safety in Kotlin
- Detail screen with full information
- Back arrow support from detail screen to main screen