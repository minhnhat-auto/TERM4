# Import the random library to use for the dice later
import random

# Define The number of lives for the Hero and Monster
numLives = 10           # number of player's lives remaining
mNumLives = 12          # number of monster's lives remaining

# Define the Dice
diceOptions = [1, 2, 3, 4, 5, 6]
# Lab 2 Answer: 1. Define the Weapons
weapons = ["Fist", "Knife", "Club", "Gun", "Bomb", "Nuclear Bomb"]

# Lab 3: Define the Loot
lootOptions = ["Health Potion", "Poison Potion", "Secret Note", "Leather Boots", "Flimsy gloves"]
goodLootOptions = ["Health Potion", "Leather Boots"]
badLootOptions = ["Poison Potion"]
belt = []

# Lab 3: Loop to get Valid Input
inputInvalid = True
i = 0

while inputInvalid and i in range(5):
    combatStrength = input("Enter your combat Strength (1-6): ")
    mCombatStrength = input("Enter the monster's combat Strength (1-6): ")

    # Lab 2 Answer: 5. Validate input using an if, else: Check if the string inputted is numeric
    if (not combatStrength.isnumeric()) or (not mCombatStrength.isnumeric()):
        # If one of the inputs are invalid, print error message and halt
        print("One or more invalid inputs. Player needs to enter integer numbers for Combat Strength")
        i += 1
        continue
    else:
        # Lab 3: Input was Valid
        inputInvalid = False
        combatStrength = int(combatStrength)
        mCombatStrength = int(mCombatStrength)

        # Lab 2 Answer: 2. Roll for weapon
        input("Roll the dice for your weapon (Press enter)")
        weaponRoll = random.choice(diceOptions)

        # Lab 3: Limit the combatStrength to 6
        combatStrength = min(6, (combatStrength + weaponRoll))
        print("The hero\'s weapon is " + str(weapons[weaponRoll-1]))

        # Lab 2 Answer: 3. Weapon Roll Analysis
        input("Analyze the Weapon roll (Press enter)")
        if weaponRoll <= 2:
            print("--- You rolled a weak weapon, friend")
        elif weaponRoll <= 4:
            print("--- Your weapon is meh")
        else:
            print("--- Nice weapon, friend!")

        # Lab 2 Answer: 4. If the weapon rolled is not a Fist, print out "Thank goodness you didn't roll the Fist..."
        if weapons[weaponRoll-1] != "Fist":
            print("--- Thank goodness you didn't roll the Fist...")

        # Roll for player health points
        input("Roll the dice for your health points (Press enter)")
        healthPoints = random.choice(diceOptions)
        print("Player rolled " + str(healthPoints) + " health points")

        # Roll for monster health points
        input("Roll the dice for the monster's health points (Press enter)")
        mHealthPoints = random.choice(diceOptions)
        print("Player rolled " + str(mHealthPoints) + " health points for the monster")

        # Lab 3: Collect Loot
        print("!!You find a loot bag! You look inside to find 2 items: ")
        input("Roll for first item (Press enter)")
        lootRoll = random.choice(range(1, len(lootOptions) + 1))
        loot = lootOptions.pop(lootRoll - 1)
        belt.append(loot)
        print("Your belt: " + str(belt))

        input("Roll for second item (Press enter)")
        lootRoll = random.choice(range(1, len(lootOptions) + 1))
        loot = lootOptions.pop(lootRoll - 1)
        belt.append(loot)
        print("Your belt: " + str(belt))

        print("You're super neat, so you organize your belt alphabetically")
        belt.sort()
        print("Your belt: " + str(belt))

        # Lab 3: Use Loot
        print("!!You see a monster in the distance! So you quickly use your first item: ")
        firstItem = belt.pop(0)
        if firstItem in goodLootOptions:
            healthPoints = min(6, (healthPoints + 2))
            print("You used " + firstItem + " to up your health to " + str(healthPoints))
        elif firstItem in badLootOptions:
            healthPoints = max(0, (healthPoints - 2))
            print("You used " + firstItem + " to hurt your health to " + str(healthPoints))
        else:
            print("You used: " + firstItem + " but it's not helpful")

        input("Analyze the roll (Press enter)")
        # Compare Player vs Monster's strength
        print("--- You are matched in strength: " + str(combatStrength == mCombatStrength))

        # Check the Player's overall strength and health
        print("--- You have a strong player: " + str((combatStrength + healthPoints) >= 8))

        # Fight Sequence
        print("You meet the monster. FIGHT!!")
        input("You strike first (Press enter)")

        print("Player's sword (" + str(combatStrength) + ") ---> Monster (" + str(mHealthPoints) + ")")

        if combatStrength >= mHealthPoints:
            # Player was strong enough to kill monster in one blow
            mHealthPoints = 0
            print("You have killed the monster")
        else:
            # Player only damaged the monster
            mHealthPoints -= combatStrength

            print("You have reduced the monster's health to: " + str(mHealthPoints))

            print("The monster strikes!!!")
            print("Monster's Claw (" + str(mCombatStrength) + ") ---> Player (" + str(healthPoints) + ")")
            if mCombatStrength >= healthPoints:
                # Monster was strong enough to kill player in one blow
                healthPoints = 0
                print("Player is dead")
            else:
                # Monster only damaged the player
                healthPoints -= mCombatStrength
                print("The monster has reduced Player's health to: " + str(healthPoints))











