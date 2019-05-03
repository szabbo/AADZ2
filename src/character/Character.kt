package character

import npc.Enemy
import abilitys.PlayerAbilities
import items.Dice
import items.weapons.Weapon
import kotlin.random.Random

object Character : PlayerAbilities, Dice {
    var armor = 12
    var currentHealth = 40
    const val maxHealth = 40
    var speed = 30
    var weapon: Weapon? = null
    var isFirst = false

    override fun doDamageToEnemy(enemy: Enemy, numberOfSides: Int) {
        val dmg = throwDice(numberOfSides) + this.weapon!!.damage
        when {
            dmg > enemy.eArmor -> {
                enemy.currenteHealth -= (dmg - enemy.eArmor)
                when{
                    enemy.currenteHealth < 0 -> enemy.currenteHealth = 0
                }
            }
            else -> println("Puny human, you are too weak!")
        }
    }

    override fun healPlayer(heal: Int) {
        when {
            this.currentHealth < this.maxHealth -> {
                this.currentHealth += heal
                when{
                    this.currentHealth > this.maxHealth -> this.currentHealth = this.maxHealth
                }
            }
            else -> println("Your HP is full!")
        }
    }

    override fun throwDice(numberOfSides: Int): Int = Random.nextInt(1, numberOfSides)

    fun decideWhoIsFirst(enemy: Enemy) {
        when {
            this.speed >= enemy.eSpeed -> this.isFirst = true
            else -> enemy.isFirst = true
        }
    }

    fun checkMyStats() {
        println("Health: $currentHealth")
        println("Armor: $armor")
        println("Speed: $speed")
    }

    fun weaponHealing(weapon: Weapon) {
        if (this.weapon != null && weapon.isHeal){
            if ((this.currentHealth + weapon.healingAmount) > this.maxHealth)
                this.currentHealth = this.maxHealth
            else
                this.currentHealth += weapon.healingAmount
        }
    }

    fun equipWeapon(weapon: Weapon){
        this.weapon = weapon
        weaponHealing(weapon)
    }

    fun unequipWeapon(){
        this.weapon = null
    }
}
