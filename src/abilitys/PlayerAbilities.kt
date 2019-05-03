package abilitys
import npc.Enemy

interface PlayerAbilities {
    fun healPlayer(heal: Int)
    fun doDamageToEnemy(enemy: Enemy, damage: Int)
}
