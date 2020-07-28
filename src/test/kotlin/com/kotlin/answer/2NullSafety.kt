package com.kotlin.answer

fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer){
    val email = client?.personalInfo?.email
    if (email != null)
        mailer.sendMessage(email,message!!)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
class Mailer{
    fun sendMessage(email: String, message: String) = println("email $email got message $message")
}

fun main() {
    val client = Client(PersonalInfo("h@@.com"))
    sendMessageToClient(client, "messageToSend" , Mailer())
}
