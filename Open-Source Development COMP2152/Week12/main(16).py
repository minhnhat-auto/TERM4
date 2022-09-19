import random

small_dice_options = list(range(1, 7))  # Max combat strength is 6
big_dice_options = list(range(1, 21))  # Max health points is 20

# class Character:

# Lab 10 - Answer 1a
class Hero:
    # Constructor
    # Lab 10 - Answer 1c, d
    def __init__(self):
        print("Creating Hero")
        self.combat_strength = random.choice(small_dice_options)
        self.health_points = random.choice(big_dice_options)

    # Lab 10 - Answer 1b
    def hero_attacks(self, combat_strength, m_health_points):
        if combat_strength <= 0 or combat_strength >= 7:
            print("Hero cannot fight with 0 combat strength. Cannot exceed maximum strength of 6")
        elif m_health_points <= 0 or m_health_points >= 21:
            print("Monster must be alive, and not exceed the maximum health points 20")
        else:
            ascii_image = """
                                        @@   @@ 
                                        @    @  
                                        @   @   
                       @@@@@@          @@  @    
                    @@       @@        @ @@     
                   @%         @     @@@ @       
                    @        @@     @@@@@     
                       @@@@@        @@       
                       @    @@@@                
                  @@@ @@                        
               @@     @                         
           @@*       @                          
           @        @@                          
                   @@                                                    
                 @   @@@@@@@                    
                @            @                  
              @              @                  

          """
            print(ascii_image)
            print("Player's weapon (" + str(combat_strength) + ") ---> Monster (" + str(m_health_points) + ")")
            if combat_strength >= m_health_points:
                # Player was strong enough to kill monster in one blow
                m_health_points = 0
                print("You have killed the monster")
            else:
                # Player only damaged the monster
                m_health_points -= combat_strength

                print("You have reduced the monster's health to: " + str(m_health_points))
        return m_health_points

    # Lab 10 - Answer 1e
    def __del__(self):
        print("The Hero object is being destroyed by the garbage collector")

class Monster:
    # Constructor
    def __init__(self):
        print("Creating Monster")
        self.m_combat_strength = random.choice(small_dice_options)
        self.m_health_points = random.choice(big_dice_options)

    def monster_attacks(self, m_combat_strength, health_points):
        if m_combat_strength <= 0 or m_combat_strength >= 7:
            print("Monster cannot fight with 0 combat strength. Cannot exceed maximum strength of 6")
        elif health_points <= 0 or health_points >= 21:
            print("Hero must be alive, and not exceed the maximum health points 20")
        else:
            ascii_image2 = """                                                                 
                   @@@@ @                           
              (     @*&@  ,                         
            @               %                       
             &#(@(@%@@@@@*   /                      
              @@@@@.                                
                       @       /                    
                        %         @                 
                    ,(@(*/           %              
                       @ (  .@#                 @   
                                  @           .@@. @
                           @         ,              
                              @       @ .@          
                                     @              
                                  *(*  *      
                     """
            print(ascii_image2)
            print("Monster's Claw (" + str(m_combat_strength) + ") ---> Player (" + str(health_points) + ")")
            if m_combat_strength >= health_points:
                # Monster was strong enough to kill player in one blow
                health_points = 0
                print("Player is dead")
            else:
                # Monster only damaged the player
                health_points -= m_combat_strength
                print("The monster has reduced Player's health to: " + str(health_points))
        return health_points

    def __del__(self):
        print("The Monster object is being destroyed by the garbage collector")


# Lab 10 - Answer 1f
hero = Hero()
monster = Monster()
while monster.m_health_points > 0 and hero.health_points > 0:

    input("Roll to see who attacks first (Press Enter)")
    attack_roll = random.choice(small_dice_options)
    if not (attack_roll % 2 == 0):
        input("You strike (Press enter)")
        # Hero Attacks First
        monster.m_health_points = hero.hero_attacks(hero.combat_strength, monster.m_health_points)
        if monster.m_health_points != 0:
            input("The monster strikes (Press enter)!!!")
            # Monster Attacks Back
            hero.health_points = monster.monster_attacks(monster.m_combat_strength, hero.health_points)

    else:
        # Monster Attacks First
        input("The Monster strikes (Press enter)")
        hero.health_points = monster.monster_attacks(monster.m_combat_strength, hero.health_points)
        if hero.health_points != 0:
            input("The hero strikes!! (Press enter)")
            # Hero Attacks Back
            monster.m_health_points = hero.hero_attacks(hero.combat_strength, monster.m_health_points)