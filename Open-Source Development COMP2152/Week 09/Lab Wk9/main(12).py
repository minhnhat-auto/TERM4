import random
import function

# Game Flow
# Define two Dice
small_dice_options = list(range(1, 7))  # Max combat strength is 6
big_dice_options = list(range(1, 21))  # Max health points is 20

# Define the number of stars to award the player
num_stars = 0
input_valid = False

# Loop to get valid input for Hero Combat Strength
i = 0
while not input_valid and i in range(5):
    # Lab 9 - Add try catch block for combat strength
    # Lab 9 - Let’s the program know you’re potentially expecting an error
    try:
        combat_strength = int(input("Enter your combat Strength (1-6): "))
        # Validate input: Check if the string inputted
        if combat_strength not in range(1, 7):
            print("Enter a valid integer between 1 and 6 only")
            i = i + 1

        else:
            input_valid = True

    # Lab 9 - If the error occurs, make sure to add your own custom message instead of letting the program crash with a red error
    except ValueError:
        print("Exception: Invalid input. Player needs to enter integer numbers for Combat Strength")

# Roll for monster combat strength
input("Roll the dice for the monster's combat strength (Press enter)")
m_combat_strength = random.choice(small_dice_options)
print("Player rolled " + str(m_combat_strength) + " combat strength for the monster")

# Roll for player health points
input("Roll the dice for your health points (Press enter)")
health_points = random.choice(big_dice_options)
print("Player rolled " + str(health_points) + " health points")

# Roll for monster combat strength
input("Roll the dice for the monster's combat strength (Press enter)")
m_combat_strength = random.choice(small_dice_options)
print("Player rolled " + str(m_combat_strength) + " combat strength for the monster")

# Roll for monster health points
input("Roll the dice for the monster's health points (Press enter)")
m_health_points = random.choice(big_dice_options)
print("Player rolled " + str(m_health_points) + " health points for the monster")

try:
    m_health_points = function.hero_attacks("Somestring1", "Somestring2")
except ValueError as ve:
    print("Error Class: " + str(ValueError))


# Loop while the monster and the player are alive. Call fight sequence functions
while m_health_points > 0 and health_points > 0:
    # Fight Sequence
    # Who attacks first?
    input("Roll to see who attacks first (Press Enter)")
    attack_roll = random.choice(small_dice_options)
    if not (attack_roll % 2 == 0):
        input("You strike (Press enter)")
        # Hero Attacks First
        try:
            # m_health_points = function.hero_attacks(combat_strength, m_health_points)
            m_health_points = function.hero_attacks("Somestring1", "Somestring2")  # Debug statement for

            if m_health_points != 0:
                input("The monster strikes (Press enter)!!!")
                # Monster Attacks Back
                health_points = function.monster_attacks(m_combat_strength, health_points)
        except ValueError:
            print("Exception: combat_strength and m_health_points both need to be integers")

    else:
        # Monster Attacks First
        input("The Monster strikes (Press enter)")
        health_points = function.monster_attacks(m_combat_strength, health_points)
        # health_points = function.monster_attacks("Somestring1", "Somestring2")
        if health_points != 0:
            input("The hero strikes!! (Press enter)")
            # Hero Attacks Back
            m_health_points = function.hero_attacks(combat_strength, m_health_points)
