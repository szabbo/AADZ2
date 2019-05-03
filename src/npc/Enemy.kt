package npc

import abilitys.EnemyAbilities
import character.Character
import items.Dice
import kotlin.random.Random


class Enemy(enemyName: String, enemyHealth: Int, enemyArmor: Int, enemySpeed: Int, numberOfSides: Int) : EnemyAbilities, Dice{
    val enemyName = enemyName
    var currenteHealth = enemyHealth
    val maxeHealth = enemyHealth
    val eArmor = enemyArmor
    val numberOfSides = numberOfSides
    var eSpeed = enemySpeed
    var isFirst = false

    override fun doDamageToPlayer(character: Character, numberOfSides: Int) {
        val dmg = throwDice(numberOfSides) + 3
        when{
            character.armor < dmg -> character.currentHealth -= ((dmg - character.armor) + 5)
            else -> println("You are too weak to defeat the champion of justice!")
        }
    }

    override fun healEnemy(heal: Int) {
        when{
            currenteHealth <= maxeHealth -> {
                currenteHealth += heal
                when{
                    currenteHealth > maxeHealth -> currenteHealth = maxeHealth
                }
            }
            else -> println("I just wasted my turn!")
        }
    }

    override fun throwDice(numberOfSides: Int): Int = Random.nextInt(1, numberOfSides)
}
