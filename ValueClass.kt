package com.example.designpatterns

@JvmInline
value class Email(val value: String)

fun sendEmail(email: Email) {
    println("Sending email to: ${email.value}")
}

fun main() {
    val myEmail = Email("akshaya@example.com")
    sendEmail(myEmail)
}
