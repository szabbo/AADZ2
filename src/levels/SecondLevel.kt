package levels

import abilitys.fighting
import character.Character
import npc.Enemy

fun startOfTheSecondLevel() {
    println("Congratulations you made it to level two and because of that, I will be honest with you. This adventure wont")
    println("be long and exciting because I didn't have inspiration for days. So I will throw in few more fights and you")
    println("will successfully beat evil Java and help young Kotlin to restore order in world of Android. So here we go!")

    println("In distance you see a big stone door that are radiating with green light. You are thinking to yourself that")
    println("you have never seen such a huge door. You decide to walk towards them.")
    println("After few hours you are halfway down but you hear screaming. you turn behind you and you see object that looks")
    println("like a giant. It has huge bat in his hands and it's coming right at you. You feel confident since last fight")
    println("was piece of cake and you take some kind of battle stance. Giant object approaches and start's screaming:")
    println("YOU WILL PAY!!!")
    println("At that moment you knew you messed up but now it's too late.")

    secondFight()
}

fun secondFight() {
    println("Fight starts, but before you and your opponent clash your weapons he raises his bat into your face and says:")
    println("Even if I don't beat you, my master Java will, and you will pay for this. You will never escape this place!")
    println("And with that fight begins.")

    val giantObject = Enemy("giantObject", 30, 10, 28, 10)

    Character.decideWhoIsFirst(giantObject)
    fighting(giantObject)

    println("Finally you have beaten him! It took you long enough but you succeeded. Let's move one, and try to escape this place!")
    endGame()
}
