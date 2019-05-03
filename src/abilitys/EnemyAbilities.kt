package abilitys

import character.Character

interface EnemyAbilities{
    fun doDamageToPlayer(character: Character, numberOfSides: Int)
    fun healEnemy(heal: Int)
}