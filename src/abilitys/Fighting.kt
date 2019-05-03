package abilitys

import character.Character
import npc.Enemy
import kotlin.random.Random

fun fighting(enemy: Enemy){
    var choice: String

    while (Character.currentHealth >= 1 && enemy.currenteHealth != 0) {
        println("Your opponent has ${enemy.currenteHealth} and your is ${Character.currentHealth}")
        println("Chose:")
        println("1 - Attack your opponent")
        println("2 - Heal")

        choice = readLine().toString()

        when (choice) {
            "1" -> {
                when {
                    Character.isFirst -> {
                        Character.doDamageToEnemy(enemy, Character.weapon!!.dice)
                        when {
                            enemy.currenteHealth > 0 -> enemy.doDamageToPlayer(Character, 12)
                        }
                    }

                    else -> {
                        enemy.doDamageToPlayer(Character, 12)
                        Character.doDamageToEnemy(enemy, Character.weapon!!.dice)
                    }
                }
            }

            "2" -> {
                when {
                    Character.isFirst -> {
                        Character.healPlayer(Random.nextInt(1, 10))
                        when(enemy.enemyName){
                            "bossJava" -> enemy.healEnemy(Random.nextInt(1, 6))
                            else -> println("If you are healing then you are cheating!")
                        }
                    }

                    else -> {
                        enemy.doDamageToPlayer(Character, 12)
                        Character.doDamageToEnemy(enemy, Character.weapon!!.dice)
                    }
                }
            }
        }
    }
}