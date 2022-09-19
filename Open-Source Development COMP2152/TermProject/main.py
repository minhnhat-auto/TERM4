# Lab Professor: Ms.Laily Ajellu
import datetime

food = {" Crispy Chicken Wrap": "$2.55",
        "Bacon English Muffin": "$1.81",
        "Noodle Soup": "(R) $1.25 (L) $2.11"}

donut = {"Boston Cream": "$1.24"}

coffee = {"Dark_Roast": "(L) $1.22 (S) $1.00",
          "Ice_coffee": "(L) $1.44 (S) $1.20",
          "French Vanilla": "(L) $1.55 (S) $1.23"}


card_temp = {}
card = {}



class Food:
    def __init__(self, f_name, f_price):
        self.food_name = f_name
        self.food_price = int(f_price)


class Wrap(Food):
    def __init__(self):
        Food.__init__(self, "Crispy Chicken Wrap", 2.55)
        self.counter = 0

    @property
    def counter(self):
        return self.counter

    @counter.setter
    def counter(self, value):
        self._counter = value


class Sandwish(Food):
    def __init__(self):
        Food.__init__(self, "Bacon English Muffin", 1.80)
        self.counter = 0

    @property
    def counter(self):
        return self.counter

    @counter.setter
    def counter(self, value):
        self._counter = value


class Soup(Food):
    def __init__(self, f_price, size):
        Food.__init__(self, "Noodle Soup", f_price)
        self.food_price = f_price
        self.size = size
        self.counter = 0

    @property
    def counter(self):
        return self.counter

    @counter.setter
    def counter(self, value):
        self._counter = value


class Donut(Food):
    def __init__(self):
        Food.__init__(self, "Boston Cream", 1.20)
        self.counter = 0

    @property
    def counter(self):
        return self.counter

    @counter.setter
    def counter(self, value):
        self._counter = value


class Coffee:
    def __init__(self, d_name, d_price):
        self.drink_name = d_name
        self.drink_price = d_price


class DarkRoast(Coffee):
    def __init__(self, d_price, size, type_c):
        Coffee.__init__(self, "Dark_Roast", d_price)
        self.drink_price = d_price
        self.type = type_c
        self.size = size
        self.counter = 0

    @property
    def counter(self):
        return self.counter

    @property
    def type_d(self):
        return self.type

    @counter.setter
    def counter(self, value):
        self._counter = value


class Ice_coffee(Coffee):
    def __init__(self, d_price, size, lvl_ice):
        Coffee.__init__(self, "Ice_coffee", d_price)
        self.drink_price = d_price
        self.size = size
        self.level_ice = lvl_ice
        self.counter = 0

    @property
    def counter(self):
        return self.counter

    @counter.setter
    def counter(self, value):
        self._counter = value


class FrenVan(Coffee):
    def __init__(self, d_price, size):
        Coffee.__init__(self, "French Vanilla", d_price)
        self.drink_price = d_price
        self.size = size
        self.counter = 0

    @property
    def counter(self):
        return self.counter

    @counter.setter
    def counter(self, value):
        self._counter = value


def check_and_update(name_item, many):
    if len(card) != 0:
        for key, value in card.items():
            splitter = key.split(" ", 1)
            num_many = int(splitter.pop(0))
            print(num_many)
            string_name = ' '.join(splitter)
            del_string_name = str(num_many) + " " + str(string_name)
            print(string_name)
            if str(string_name) == str(name_item):
                print("23")
                while True:
                    buy_more_confirm = input("You surely wanna buy " + many + " " + name_item + " more? y(Yes) - n(No): ")
                    if check_for_blank(buy_more_confirm):
                        if buy_more_confirm == "y":
                            del card[del_string_name]

                            num_many += int(many)
                            return num_many
                        elif buy_more_confirm == "n":
                            while True:
                                edit_confirm = input("Do you want to get " + many + " " + name_item + " instead of " + str(num_many) + " " + name_item + "? y(Yes) - n(No): ")
                                if check_for_blank(edit_confirm):
                                    if edit_confirm.lower() == "y":
                                        del card[del_string_name]

                                        print("Changed successfully***")
                                        return "changed"
                                    elif edit_confirm.lower() == "n":
                                        print("Sorry, we misunderstand you!!")
                                        return "sorry"
                                    else:
                                        print("\nPlease enter correct type!!")
                        else:
                            print("\nPlease enter correct type!!")
            else:
                return "valid"
    else:
        print("Added successfully***")
        return "valid1"



def check_for_blank_and_int(user_input):
    if len(user_input) != 0:
        try:
            if int(user_input):
                return True
        except ValueError:
            return False
    else:
        return False


def check_for_blank(user_input):
    if len(user_input) != 0:
        return True
    else:
        return False


def modify_coffee(class_name, price_small, price_large, ice):
    repeat_amount = True
    repeat_size = True
    repeat_type = True

    while repeat_amount:
        many = input("How many: ")
        if check_for_blank_and_int(many) is True:
            while repeat_size:
                size = input("What size would you like: l(Large) - s(Small): ")
                if check_for_blank(size) is True:
                    if size.lower() == "l":
                        if ice is None:
                            while repeat_type:
                                type_coffee = input("How do you like it? r(Regular) - b(Black): ")
                                if check_for_blank(type_coffee):
                                    if type_coffee.lower() == "r":
                                        res = class_name(price_large, "L", "(Regular)")

                                        temp = str(res.size) + " " + str(res.drink_name) + " " + str(res.type)

                                        result_check_and_update = check_and_update(temp, many)
                                        print(result_check_and_update)


                                        if str(result_check_and_update) == "changed":
                                            class_name.counter = int(many)
                                            card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                                res.drink_name) + " " + str(res.type)] = "$" + str(res.drink_price)

                                            print(card)
                                            repeat_size = False
                                            repeat_amount = False
                                            break
                                        elif isinstance(result_check_and_update, int) is True:
                                            class_name.counter = result_check_and_update
                                            card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                                res.drink_name) + " " + str(res.type)] = "$" + str(res.drink_price)
                                            print("Added successfully***1")
                                            repeat_size = False
                                            repeat_amount = False
                                            break
                                        elif str(result_check_and_update) == "sorry":
                                            repeat_size = False
                                            repeat_amount = False
                                            break
                                        elif str(result_check_and_update) == "valid":
                                            class_name.counter = int(many)
                                            card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                                res.drink_name) + " " + str(res.type)] = "$" + str(res.drink_price)
                                            print("1")
                                            repeat_size = False
                                            repeat_amount = False
                                            break
                                        elif str(result_check_and_update) == "valid1":
                                            class_name.counter = int(many)
                                            card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                                res.drink_name) + " " + str(res.type)] = "$" + str(res.drink_price)
                                            print(card)
                                            print("2")
                                            repeat_size = False
                                            repeat_amount = False
                                            break


                                    elif type_coffee.lower() == "b":
                                        res = class_name(price_large, "L", "(Black)")
                                        class_name.counter = int(many)
                                        print("\nAdded successfully")

                                        card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                            res.drink_name) + " " + str(res.type)] = "$" + str(res.drink_price)

                                        repeat_size = False
                                        repeat_amount = False
                                        break
                                    elif type_coffee.lower() != "r" or type_coffee.lower() != "b":
                                        print("\nPlease enter appropriate type!!")
                                        repeat_type = True
                                else:
                                    print("\nPlease enter the size as you wish!!")
                                    repeat_type = True

                        elif ice == "ice":
                            while True:
                                ice_level = input("How level of ice? Extra(e) - Less(l) - Regular(r): ")
                                if check_for_blank(ice_level):
                                    if ice_level.lower() == "e":
                                        res = class_name(price_large, "L", "(Extra ice)")
                                        class_name.counter = int(many)
                                        print("\nAdded successfully")

                                        card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                            res.drink_name) + " " + str(res.level_ice)] = "$" + str(res.drink_price)

                                        repeat_size = False
                                        repeat_amount = False
                                        break
                                    elif ice_level.lower() == "l":
                                        res = class_name(price_large, "L", "(Less ice)")
                                        class_name.counter = int(many)
                                        print("\nAdded successfully")

                                        card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                            res.drink_name) + " " + str(res.level_ice)] = "$" + str(res.drink_price)

                                        repeat_size = False
                                        repeat_amount = False
                                        break
                                    elif ice_level.lower() == "r":
                                        res = class_name(price_large, "L", "(Regular ice)")
                                        class_name.counter = int(many)
                                        print("\nAdded successfully")

                                        card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                            res.drink_name) + " " + str(res.level_ice)] = "$" + str(res.drink_price)

                                        repeat_size = False
                                        repeat_amount = False
                                        break
                                    else:
                                        print("\nPlease choose favourite level!!")
                                else:
                                    print("\nPlease choose favourite level!!")



                    elif size.lower() == "s":
                        if ice is None:
                            while repeat_type:
                                type_coffee = input("How do you like it? r(Regular) - b(Black): ")
                                if check_for_blank(type_coffee):
                                    if type_coffee.lower() == "r":
                                        res = class_name(price_small, "S", "(Regular)")
                                        class_name.counter = int(many)
                                        print("\nAdded successfully")

                                        card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                            res.drink_name) + " " + str(res.type)] = "$" + str(res.drink_price)

                                        repeat_size = False
                                        repeat_amount = False
                                        break
                                    elif type_coffee.lower() == "b":
                                        res = class_name(price_small, "S", "(Black)")
                                        class_name.counter = int(many)
                                        print("\nAdded successfully")

                                        card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                            res.drink_name) + " " + str(res.type)] = "$" + str(res.drink_price)

                                        repeat_size = False
                                        repeat_amount = False
                                        break
                                    elif type_coffee.lower() != "r" or type_coffee.lower() != "b":
                                        print("\nPlease enter appropriate type!!")
                                        repeat_type = True
                                else:
                                    print("\nPlease enter the size as you wish!! ")
                                    repeat_type = True
                        elif ice == "ice":
                            res = class_name(price_large, "S", "")
                            class_name.counter = int(many)
                            print("\nAdded successfully")

                            card[str(class_name.counter) + " " + str(res.size) + " " + str(
                                res.drink_name)] = "$" + str(res.drink_price)

                            repeat_size = False
                            repeat_amount = False
                            break
                    elif size.lower() != "s" or size.lower() != "l":
                        print("\nPlease enter appropriate size!!")
                        repeat_size = True
                elif check_for_blank(size) is False:
                    print("\nPlease enter the size as you wish!! ")
                    repeat_size = True
        elif check_for_blank_and_int(many) is False:
            print("\nPlease enter appropriate number!!")
            repeat_amount = True


def shopping_cart():
    global card_temp
    choose_another_item = True
    choose_first_item = True

    while choose_first_item:
        user_choice = input("\nWhat can I get for you? (Press 1-7 Meal or 9 for Combo): ")
        if (check_for_blank_and_int(user_choice) is True
                and user_choice == "1"
                or user_choice == "2"
                or user_choice == "3"
                or user_choice == "4"
                or user_choice == "5"
                or user_choice == "6"
                or user_choice == "7"
                or user_choice == "9"):
            if user_choice == "1":
                modify_coffee(DarkRoast, 1.22, 1.00, None)
                choose_first_item = False
            elif user_choice == "3":
                modify_coffee(Ice_coffee, 1.44, 1.20, "ice")
                choose_first_item = False



        else:
            print("\nPlease choose Food or Drink in Menu!!")

    while choose_another_item:
        repeat_receipt = True
        user_choice = input(
            "\nAnything else you would like to get? (Press 1-7 for Meal or 9 for Combo or E for Exit): ")
        if (check_for_blank(user_choice) is True
                and user_choice == "1"
                or user_choice == "2"
                or user_choice == "3"
                or user_choice == "4"
                or user_choice == "5"
                or user_choice == "6"
                or user_choice == "7"
                or user_choice == "9"
                or user_choice.lower() == "e"):

            if user_choice.lower() == "e":
                while repeat_receipt:
                    user_receipt = input("Would you like get Receipt? y(Yes) - n(No): ")
                    if check_for_blank(user_receipt):
                        if user_receipt.lower() == "y":
                            card_temp = card
                            receipt()
                            print("Thank you (~_~)")
                            exit()
                        elif user_receipt.lower() == "n":
                            print("Thanks for stopping by(~_~)")
                            exit()
                        else:
                            print("\nPlease enter correct type!!")
                            repeat_receipt = True
            elif user_choice == "1":
                modify_coffee(DarkRoast, 1.22, 1.00, None)
                choose_another_item = True
            elif user_choice == "3":
                modify_coffee(Ice_coffee, 1.44, 1.20, "ice")
                choose_another_item = True




        else:
            print("\nPress 1-7 for Meal or 9 for Combo or E for Exit!!")


def receipt():

    date = datetime.datetime.now()
    print("\n___________________________________________________")
    print("|" + "{:>29} {:>20}".format("MY COFFEE", "|"))
    print("|" + "{:>50}".format("|"))
    print("|" + "{:>46} {:>3}".format("Always Fresh, Always There Since 1964 ", "|"))
    print("|" + "{:>37} {:>12}".format("75 King Ave, Toronto, CA", "|"))
    print("|" + "{:>34} {:>15}".format("Tel. 999-999-1234", "|"))
    print("---------------------------------------------------")
    print("|" + "{:>50}".format("|"))
    for key, value in card_temp.items():
        splitter = key.split(" ", 1)
        num_many = splitter.pop(0)
        name_item = ' '.join(splitter)
        print("|" + "{:>3} {:<27} {:>16} {:>0}".format(num_many, name_item, value, "|"))
    print("---------------------------------------------------")
    print("|" + "{:>12} {:>35} {:>0}".format("Subtotal:", "$ 10.22", "|"))
    print("|" + "{:>12} {:>35} {:>0}".format("GST:", "$ 10.22", "|"))
    print("|" + "{:>12} {:>35} {:>0}".format("Total Tax:", "$ 10.22", "|"))
    # print("---------------------------------------------------")
    print("|" + "{:>19} {:>28} {:>0}".format("** Grand Total **", "$ 10.22", "|"))
    # print("---------------------------------------------------")
    print("|" + "{:>12} {:>35} {:>0}".format("Debit Card:", "$ 10.22", "|"))
    print("|" + "{:>12} {:>35} {:>0}".format("Change Due:", "$ 10.22", "|"))
    print("|" + "{:>12} {:>0} {:>29}".format("Cashier:", "SHIFT 1", "|"))
    print("|" + "{:>50}".format("|"))
    print("|" + "{:>36} {:>13}".format("Thanks for stopping by!!", "|"))
    print("|" + "{:>32} {:>17}".format("Tell us how we did", "|"))
    print("|" + "{:>26} {:>15} {:>7}".format("www.tellmycoffee.com", "1-888-123-4567", "|"))
    print("|" + "{:>38} {:>11}".format(str(date), "|"))
    print("---------------------------------------------------")


def main():
    n = 1
    print(
        "\n---------------------   MY COFFEE RESTAURANT  ---------------------")
    print("|" + "{:>36} {:>29}".format("--------", "|"))
    print("|" + "{:>29} {:<0} {:<0} {:>29}".format("|", "MENU", "|", "|"))
    print("|" + "{:>36} {:>29}".format("--------", "|"))
    print("|" + "{:>66}".format("|"))
    print("|" + "{:>35} {:>30}".format("COFFEE", "|"))
    print("|" + "{:>52} {:>13}".format("Price", "|"))
    for key, value in coffee.items():
        print("|", "{:>0} {:>0} {:>0} {:>22} {:>29}".format("(", str(n), ")", key, value), end="      |\n")
        n += 1
    print("|" + "{:>66}".format("|"))
    print("|" + "{:>33} {:>32}".format("FOOD", "|"))
    print("|" + "{:>52} {:>13}".format("Price", "|"))
    for key, value in food.items():
        if key == "Noodle Soup":
            print("|", "{:>0} {:>0} {:>0} {:>22} {:>30}".format("(", str(n), ")", key, value), end="     |\n")
            break
        print("|", "{:>0} {:>0} {:>0} {:>22} {:>22}".format("(", str(n), ")", key, value), end="             |\n")
        n += 1
    print("|" + "{:>66}".format("|"))
    print("|" + "{:>34} {:>31}".format("DONUT", "|"))
    print("|" + "{:>52} {:>13}".format("Price", "|"))
    for key, value in donut.items():
        print("|", "{:>0} {:>0} {:>0} {:>22} {:>22}".format("(", str(n + 1), ")", key, value), end="             |\n")
        n += 1
    print("|" + "{:>66}".format("|"))
    print("|" + "{:>34} {:>31}".format("COMBO", "|"))
    print("|" + "{:>52} {:>13}".format("Price", "|"))
    print("|", "{:>0} {:>0} {:>0} {:>22} {:>22}".format("(", str(n + 2), ")", "Coffee + Food + Donut", "$7.56"), end="             |\n")
    print("|" + "{:>66}".format("|"))
    print(
        "-------------------------------------------------------------------")
    shopping_cart()


if __name__ == "__main__":
    main()




