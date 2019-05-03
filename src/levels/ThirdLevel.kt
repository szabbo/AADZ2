package levels

import abilitys.fighting
import character.Character
import npc.Enemy

fun endGame() {
    println("Now...")
    println("We are in endgame! Just kidding, but you are actually because this is the last level that you need to beat.")
    println("And of course you will have to fight the final boss, but I don't know where is he and why is he missing.")
    println("Javaaaaa! Oh JAAAAAVAAAAAA! WHEEEREEE AREEE YOUUUUU! I think that he is not coming. Maybe he is mad because")
    println("you killed those two objects? Well who will know. Let's go, it is time for you to leave.")

    println("NOOOOOOOOOOOOOOOOOOOOO! Stop you monster! You killed those two object and now it's time to pay! I am Java")
    println("and I will avenge them.")

    println("It's time that you prepare for your fight with Java. You will soon find out that he is not a weak as those")
    println("two object that you defeated earlier. Good luck!")

    val bossJava = Enemy("bossJava", 100, 12, 32, 12)

    Character.decideWhoIsFirst(bossJava)
    fighting(bossJava)

    println("Congratulations you succeeded! You have won! Good job. Now remember your promise and fulfill it!")
    println("")
    println("The End")
}