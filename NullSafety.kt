package com.example.designpatterns

data class UserProfile(val name: String?, val email: String?)

fun fetchUserFromApi(): UserProfile? {
    // Simulating an API response
    return UserProfile(null, "akshaya@example.com")
    // return null // Uncomment this to simulate no user returned
}

fun displayUserProfile(user: UserProfile?) {
    // Using null safety
    if (user != null) {
        val name = user.name ?: "Name not available"
        val email = user.email ?: "Email not available"

        println("User Profile:")
        println("Name: $name")
        println("Email: $email")
    } else {
        println("No user data found.")
    }
}

fun main() {
    val user = fetchUserFromApi()
    displayUserProfile(user)
}
