package levels

import abilitys.fighting
import character.Character
import items.weapons.Weapon
import npc.Enemy

fun inTheBeggining() {
    println("Our story begins few weeks ago, when our hero got his assignment from Android Academia")
    println("to create game, where he will show the skills he learned during the past two lecture.")
    println("At first, he was very excited, but, after only few hours he noticed that he doesn't know")
    println("where to begin. And Because it was only Monday of the first week after the assignment was")
    println("assigned he decided that he would not be stressed out, but few seconds later, strange things")
    println(" started to happened, and he passed out.")

    letTheGameBegin()
}

fun letTheGameBegin() {
    println("You are waking up in strange place. Your head hurts and you notice that your close has changed.")
    println("You look around you and you notice that you are in some kind of castle, but instead of stones,")
    println("walls are made of something that looks like blocks of data. Now you start to get really confused.")
    println("Suddenly shiny ball of blue light appears in front of you. You startle and decide to react.")

    println("You can do few things.")
    println("First, you can try to run away.")
    println("Second, you can try to find something to fight.")
    println("And third, you can wait to see what will happen.")
    println("Choose wisely my young padawan! (to choose just type number from 1 to 3 and press enter)")

    val choice = readLine()

    when (choice) {
        "1" -> {
            println("So you decided to run away like a real champ! Well that is little bit sad, I thought")
            println("that you are a fighter, not a chicken, but never mind that, you can't escape because room is")
            println("sealed form inside out.")

            theLightSpeaksAndYouLisen()
        }

        "2" -> {
            println("Oh! So you are fighter. That is good, but as you can see (if you could see hahahahaha)")
            println("there isn't any kind of weapon in hear and trying to smash light with your hands isn't")
            println("going to help.")

            theLightSpeaksAndYouLisen()
        }

        "3" -> {
            println("Since you are here, you must be thinking that you are dreaming and you will wait to see what will")
            println("happen. I guess that is a good call. At least you can't die in you dream, or...")

            theLightSpeaksAndYouLisen()
        }
    }
}

fun theLightSpeaksAndYouLisen() {

    println("Greetings traveler! Don't be afraid, I don't bite. My name is Kotlin, and today I am here to help")
    println("you defeat my older brother Java, who decided that he will be the only programming language for Android development.")
    println("You must be thinking what are these nonsense that you are hearing, well allow me to explain.")
    println("We don't have much time so I will be brief. My brother Java and the current king of this world has gone mad!")
    println("He wishes to enslave programmers like you to develop Android apps by his cruel and complex rules where")
    println("they need to always check if they have null or not, and tons of other things. I will free you, but in")
    println("return I wish that you escape from this world, return to your own and give a shot to me. Java will try to")
    println("stop you, and he will send his minions after you so that you don't succeed to escape. I will help you by")
    println("creating a weapon that will help you beat his minions and escape. So tell me what kind of weapon you wish: ")

    println("1 - I wish a sword")
    println("2 - I wish a axe")
    println("3 - I wish a spear")

    val choice = readLine()

    when (choice) {
        "1" -> {
            println("Sword is a good choice and I will create one for you. Here I think that you will like this one.")
            println("This sword has a name, and name is Frostmourne. In one game it belongs to the Lich King so be careful")
            println("Ner'zhul's spirit is shackled to this blade.")

            val charactersWeapon = Weapon("frostmourne", 10, 6, true, 10, 10)
            Character.equipWeapon(charactersWeapon)
            firstFight()
        }

        "2" -> {
            println("Axe is barbaric weapon that lets you fight like a real berserker. This axe is special, and the name")
            println("of this axe is Gorehowl. In one game it belonged to Grom Hellscream, but his son Garrosh inherited it.")
            println("Be careful with it.")

            val charactersWeapon = Weapon("gorehowl", 12, 4, true, 8, 8)
            Character.equipWeapon(charactersWeapon)

            firstFight()
        }

        "3" -> {
            println("Since you chose a spear, I think that I can made weapon that is worthy of you. I present you")
            println("Bloodhoof Runespear. In game this spear was wilded by tauren chieftain Cairine Bloodhoof.")
            println("This weapon will help you escape this place!")

            val charactersWeapon = Weapon("bloodhoofRunespear", 11, 6, false, 8, 12)
            Character.equipWeapon(charactersWeapon)

            firstFight()
        }
    }
}

fun firstFight() {
    println("Since you have your weapon I will let you out from this place, but be careful, they are waiting for you.")

    println("And Kotlin vanishes in tin air and walls start to dissapear. Suddenly you notice small but very loud brick")
    println("of code and by structure it looks like object. You also notice that its running towards you!")
    println("You decide to fight so that you can test your new weapon.")

    val littleObject = Enemy("littleObject", 20, 5, 18, 20)

    Character.decideWhoIsFirst(littleObject)
    fighting(littleObject)

    println("You succeeded to beat your first opponent!")
    println("Nicely done, now you need to continue to move on.")

    startOfTheSecondLevel()
}