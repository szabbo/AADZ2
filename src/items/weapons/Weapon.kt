package items.weapons

data class Weapon(
    val weaponName: String,
    val dmg: Int,
    val whatDice: Int,
    val isHealing: Boolean,
    val healAmount: Int,
    val speed: Int
) {
    val name = weaponName
    val damage = dmg
    val dice = whatDice
    val isHeal = isHealing
    val healingAmount = healAmount
    val wSpeed = speed
}