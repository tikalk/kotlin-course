package com.kotlin.learn

fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer){
    TODO("add you code here")

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
