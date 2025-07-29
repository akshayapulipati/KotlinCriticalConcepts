package com.example.designpatterns

// ✅ Main class with private constructor - only the builder can create it
class User private constructor(
    val name: String?,
    val age: Int?,
    val email: String?
) {
    fun display() {
        println("Name: $name, Age: $age, Email: $email")
    }

    // Nested Builder class
    //holds temparary variables
    class Builder {
        private var name: String? = null
        private var age: Int? = null
        private var email: String? = null

        // Setter functions returning the Builder (for method chaining)
        fun setName(name: String) = apply { this.name = name }
        fun setAge(age: Int) = apply { this.age = age }
        fun setEmail(email: String?) = apply { this.email = email }

        //  Final build function to return constructed User
        fun build(): User {
            return User(name, age, email)
        }
    }
}

fun main() {
    //  Use the builder to create a User object step-by-step
    val user = User.Builder()
        .setName("Akshaya")
        .setAge(24)
        .setEmail("akshshaya@gmail.com")
        .build() // Build the final User object

    user.display()  // Call method on built user
}
