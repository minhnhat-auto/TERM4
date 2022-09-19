# emp_list = [['123', 'asdas', 'Hourly', '4', '0', '0', '1231'],
#             ['123454', 'asdas3fds', 'Manager', '4dsf', '0sdf', '0dsf', '1231fsdfsd']]
#
#



#
# display_employee()

# v = input("Money: ")
# v = "${:,.2f}".format(int(v))
# print(v)
from unicodedata import decimal

error = "Please enter correct type"


def check_for_blanks(user_input):
    if len(user_input) == 0:
        return False
    else:
        return True


def check_for_int(user_input):
    try:
        if int(user_input):
            return True
    except ValueError:
        return False


def check_for_float(user_input):
    try:
        if float(user_input):
            return True
    except ValueError:
        # print("error")
        return False


#
# verify = input("Is this your first time creating? Y(Yes) - N(No): ")
# if verify.lower() == "y":
#     total_purchased = "$0.00"
#     total_discount = "$0.00"
# elif verify.lower() == "n":
#     total_purchased = input("Enter total purchased: $")
#     while check_for_blanks(total_purchased) is False or check_for_float(total_purchased) is False:
#         print("error")
#         total_purchased = input("Enter total purchased: $")
#     total_purchased = "${:,.2f}".format(float(total_purchased))
#
#     total_discount = input("Enter total discount: $")
#     while check_for_blanks(total_discount) is False or check_for_float(total_discount) is False:
#         print(error)
#         total_discount = input("Enter total discount: $")
#     total_discount = "${:,.2f}".format(float(total_discount))
#
# else:
#     while check_for_blanks(verify) is False or verify != verify.isalpha():
#         print(error)
#         verify = input("Is this your first time creating? Y(Yes) - N(No): ")
#         if verify.lower() == "y":
#             total_purchased = "$0.00"
#             total_discount = "$0.00"
#             break
#         elif verify.lower() == "n":
#             total_purchased = input("Enter total purchased: $")
#             while check_for_blanks(total_purchased) is False or check_for_float(total_purchased) is False:
#                 print(error)
#                 total_purchased = input("Enter total purchased: $")
#
#             total_discount = input("Enter total discount: $")
#             while check_for_blanks(total_discount) is False or check_for_float(total_discount) is False:
#                 print(error)
#                 total_discount = input("Enter total discount: $")
#             break
#         elif verify.lower() != "y" and "n":
#             continue
#
#
# print(total_purchased)
# print(total_discount)

# emp_id_arr = ['312']
# while True:
#     input_id = input("Enter employee id: ")
#     if check_for_blanks(input_id) is False or check_for_int(input_id) is False:
#         print("error")
#     elif input_id not in emp_id_arr:
#         emp_id_arr.append(input_id)
#         break
#     else:
#         print("This ID already exits!")
#
# print(emp_id_arr)


# raw_name = input("Enter employee name: ")
# name = raw_name.replace(" ", "")
# while check_for_blanks(name) is False or name.isalpha() is False:
#     print(error)
#     raw_name = input("Enter employee name: ")
#     name = raw_name.replace(" ", "")
#
# print(raw_name)


# emp_type = input("Type employee name? h(Hourly) - m(Manager): ")
# if emp_type.lower() == "h":
#     emp_type = "Hourly"
# elif emp_type.lower() == "m":
#     emp_type = "Manager"
# else:
#     print(error)
#     while True:
#         emp_type = input("Type employee name? h(Hourly) - m(Manager): ")
#         if emp_type.lower() == "h":
#             emp_type = "Hourly"
#             break
#         elif emp_type.lower() == "m":
#             emp_type = "Manager"
#             break
#         elif emp_type.lower() != "h" and "m" or check_for_blanks(emp_type) is False or emp_type.isalpha() is False:
#             print(error)
#
#
#
# print(emp_type)

# year_worked = input("How many year have you been this worked? ")
# while check_for_blanks(year_worked) is False or check_for_int(year_worked) is False:
#     print(error)
#     year_worked = input("How many year have you been this worked? ")
#
# print(year_worked)


# again = input("\nDo you wanna add more: y(Yes) - n(No)? ")
# if again.lower() == "y":
#     entry = True
#     print(entry)
#
# elif again.lower() == "n":
#     print("(-~-)Thank you for using(-~-)\n\n")
#     entry = False
#     print(entry)
#
# else:
#     print(error)
#     while True:
#         again = input("\nDo you wanna add more: y(Yes) - n(No)? ")
#         if again.lower() == "y":
#             entry = True
#             print(entry)
#             break
#         elif again.lower() == "n":
#             print("(-~-)Thank you for using(-~-)\n\n")
#             entry = False
#             print(entry)
#             break
#         elif check_for_blanks(again) is False or again.isalpha() is False or again.lower() != "y" and "n":
#             print(error)


# def add_item():
#     global counter
#     global item_list, item_num_arr
#     entry = True
#     while entry:
#         print("--------------------------------------------------------------------")
#         print("                     Number of Item {0:d}".format(counter + 1))
#         print("--------------------------------------------------------------------")
#
#         while True:
#             item_num = input("Enter Item Number: ")
#             if check_for_blanks(item_num) is False or check_for_int(item_num) is False:
#                 print(error)
#             elif item_num not in item_num_arr:
#                 item_num_arr.append(item_num)
#                 break
#             else:
#                 print("This Item Number already exits!")
#
#         item_name = input("Enter Item name: ")
#         name_wout_space = item_name.replace(" ", "")
#         while check_for_blanks(name_wout_space) is False or name_wout_space.isalpha() is False:
#             print(error)
#             item_name = input("Enter Item name: ")
#             name_wout_space = item_name.replace(" ", "")
#
#         item_cost = input("Enter Cost of Item: ")
#         while check_for_blanks(item_cost) is False or check_for_int(item_cost) is False:
#             print(error)
#             item_cost = input("Enter Cost of Item: ")
#
#     item_list.append([item_num_arr[counter], item_name, item_cost])
#     counter += 1
#
#     again = input("\nDo you wanna add more: y(Yes) - n(No)? ")
#     if again.lower() == "y":
#         entry = True
#
#     elif again.lower() == "n":
#         print("(-~-)Thank you for using(-~-)\n\n")
#         entry = False
#
#     else:
#         print(error)
#         while True:
#             again = input("\nDo you wanna add more: y(Yes) - n(No)? ")
#             if again.lower() == "y":
#                 entry = True
#                 break
#             elif again.lower() == "n":
#                 print("(-~-)Thank you for using(-~-)\n")
#                 entry = False
#
#                 break
#             elif check_for_blanks(again) is False or again.isalpha() is False or again.lower() != "y" and "n":
#                 print(error)




def display_item():
    if not item_list:
        print("***List is empty***")
    else:
        print(
            "\n-----------------" + "  LIST OF ITEM  " + "-----------------\n")
        print(
            "--------------------------------------------------")
        print("{:<11} {:<13} {:<8}".format('Item Number |', 'Item Name ', '| Item Cost |'))
        print(
            "--------------------------------------------------")
        for item in item_list:
            print("{:<11} {:<15} {:<15}".format(item[0], "| " + item[1], "| $" + item[2]))

        make_pur()


def display_employee():
    if not emp_list:
        print("***List is empty***")
    else:
        print(
            "--------------------------------------------" + "          LIST OF EMPLOYEE        " + "-------------------------------------------------\n")
        print(
            "-------------------------------------------------------------------------------------------------------------------------------")
        print("{:<10} {:<20} {:<8} {:<8} {:<8} {:<8} {:<10} ".format('Employee ID |', 'Employee Name ',
                                                                     '| Employee Type |', 'Years Worked |',
                                                                     'Total Purchased |', 'Total Discount |',
                                                                     'Employee Discount Number '))
        print(
            "-------------------------------------------------------------------------------------------------------------------------------")
        for emp in emp_list:
            print("{:<11} {:<22} {:<15} {:<14} {:<17} {:<16} {:<8} ".format(emp[0], "| " + emp[1], "| " + emp[2],
                                                                            "| " + emp[3], "| $" + emp[4],
                                                                            "| $" + emp[5],
                                                                            "| " + emp[6]))



def make_pur():
    if not emp_list:
        print("\n***List of Employee is empty***")
        print("Double Checking Before Making Purchase!!!")
    else:
        while True:
            print()
            emp_exit = input("Enter Employee Discount Number: ")
            if check_for_blanks(emp_exit) is True and check_for_int(emp_exit) is True:
                if emp_exit in emp_discount_arr:
                    emp_pst = emp_discount_arr.index(emp_exit)
                    while True:
                        item_exist = input("Enter Item Number: ")
                        if check_for_blanks(item_exist) is True and check_for_int(item_exist) is True:
                            if item_exist in item_num_arr:
                                item_pst = item_num_arr.index(item_exist)
                                while True:
                                    conf = input("Are you sure to make this purchase? y(Yes) - n(No): ")
                                    if conf.lower() == "n":
                                        while True:
                                            new_one = input("Do you wanna make new purchase? y(Yes) - n(No): ")
                                            if new_one.lower() == "y":
                                                print()
                                                make_pur()
                                                return
                                            elif new_one.lower() == "n":
                                                return display_employee()

                                            elif check_for_blanks(new_one) is False or new_one.isalpha() is False or new_one.lower() != "y" and "n":
                                                print(error)
                                    elif check_for_blanks(conf) is False or conf.isalpha() is False or conf.lower() != "y" and "n":
                                        print(error)
                                    elif conf.lower() == "y":
                                        cal_discount_price(emp_pst, item_pst)
                                        while True:
                                            new_one = input("Do you wanna make new purchase? y(Yes) - n(No): ")
                                            if new_one.lower() == "y":
                                                print()
                                                make_pur()
                                                return
                                            elif new_one.lower() == "n":
                                                return display_employee()

                                            elif check_for_blanks(
                                                    new_one) is False or new_one.isalpha() is False or new_one.lower() != "y" and "n":
                                                print(error)
                            else:
                                print("Item does not exists. Please input others!!")
                        else:
                            print(error)
                else:
                    print("Employee does not exists. Please input others!!")
            else:
                print(error)


emp_list = [['123', 'Minh Nhat', 'Manager', '8', '1,000.00', '2,000.54', '150620000']]
item_list = [['123', 'dsfdsf', '32'], ['566', 'dsfdsf', '52.44']]
emp_discount_arr = ['435', '465', '464']
item_num_arr = ['123', '566']



def cal_discount_price(positionEmp, positionItm):
    other_opt = input("Did he/she receive $200 discount? y(Yes) - n(No): ")
    if other_opt == "y":
        item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
        temp_1 = float(item_list[positionItm][2]) + float(0)
        emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")
        temp_1 = temp_1 + float(emp_list[positionEmp][4])
        emp_list[positionEmp][4] = "{:,.2f}".format(float(temp_1))

        emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
        temp_2 = float(emp_list[positionEmp][5]) + float(0)
        emp_list[positionEmp][5] = "{:,.2f}".format(float(temp_2))
        return emp_list[positionEmp][4], emp_list[positionEmp][5]

    elif other_opt == "n":

        if emp_list[positionEmp][2] == "Manager":
            if int(emp_list[positionEmp][3]) >= 5:

                discount = float(0.2)
                item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                temp_1 = discount * float(item_list[positionItm][2])
                emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                temp_2 = float(item_list[positionItm][2]) - temp_1
                emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                return emp_list[positionEmp][4], emp_list[positionEmp][5]

            elif int(emp_list[positionEmp][3]) in range(1, 5):

                discount = (float(emp_list[positionEmp][3]) * float(0.02)) + float(0.1)
                item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                temp_1 = discount * float(item_list[positionItm][2])
                emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                temp_2 = float(item_list[positionItm][2]) - temp_1
                emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                return emp_list[positionEmp][4], emp_list[positionEmp][5]

        elif emp_list[positionEmp][2] == "Hourly":
            print(emp_list[positionEmp][2])

            if int(emp_list[positionEmp][3]) >= 5:
                print(emp_list[positionEmp][3] + "inside 5")

                discount = float(0.1)
                item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                temp_1 = discount * float(item_list[positionItm][2])
                emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                temp_2 = float(item_list[positionItm][2]) - temp_1
                emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                return emp_list[positionEmp][4], emp_list[positionEmp][5]

            elif int(emp_list[positionEmp][3]) in range(1, 5):
                print(emp_list[positionEmp][3] + "inside 1,2,3,4")

                discount = (float(emp_list[positionEmp][3]) * float(0.02))
                item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                temp_1 = discount * float(item_list[positionItm][2])
                emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                temp_2 = float(item_list[positionItm][2]) - temp_1
                emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                return emp_list[positionEmp][4], emp_list[positionEmp][5]
    else:
        print(error)
        while True:
            other_opt = input("Did he/she receive $200 discount? y(Yes) - n(No): ")
            if other_opt == "y":
                item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                temp_1 = float(item_list[positionItm][2]) + float(0)
                emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")
                temp_1 = temp_1 + float(emp_list[positionEmp][4])
                emp_list[positionEmp][4] = "{:,.2f}".format(float(temp_1))

                emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                temp_2 = float(emp_list[positionEmp][5]) + float(0)
                emp_list[positionEmp][5] = "{:,.2f}".format(float(temp_2))
                return emp_list[positionEmp][4], emp_list[positionEmp][5]

            elif other_opt == "n":

                if emp_list[positionEmp][2] == "Manager":
                    if int(emp_list[positionEmp][3]) >= 5:

                        discount = float(0.2)
                        item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                        emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                        emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                        temp_1 = discount * float(item_list[positionItm][2])
                        emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                        temp_2 = float(item_list[positionItm][2]) - temp_1
                        emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                        emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                        emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                        return emp_list[positionEmp][4], emp_list[positionEmp][5]

                    elif int(emp_list[positionEmp][3]) in range(1, 5):

                        discount = (float(emp_list[positionEmp][3]) * float(0.02)) + float(0.1)
                        item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                        emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                        emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                        temp_1 = discount * float(item_list[positionItm][2])
                        emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                        temp_2 = float(item_list[positionItm][2]) - temp_1
                        emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                        emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                        emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                        return emp_list[positionEmp][4], emp_list[positionEmp][5]

                elif emp_list[positionEmp][2] == "Hourly":
                    print(emp_list[positionEmp][2])

                    if int(emp_list[positionEmp][3]) >= 5:
                        print(emp_list[positionEmp][3] + "inside 5")

                        discount = float(0.1)
                        item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                        emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                        emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                        temp_1 = discount * float(item_list[positionItm][2])
                        emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                        temp_2 = float(item_list[positionItm][2]) - temp_1
                        emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                        emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                        emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                        return emp_list[positionEmp][4], emp_list[positionEmp][5]

                    elif int(emp_list[positionEmp][3]) in range(1, 5):
                        print(emp_list[positionEmp][3] + "inside 1,2,3,4")

                        discount = (float(emp_list[positionEmp][3]) * float(0.02))
                        item_list[positionItm][2] = item_list[positionItm][2].replace(",", "")
                        emp_list[positionEmp][5] = emp_list[positionEmp][5].replace(",", "")
                        emp_list[positionEmp][4] = emp_list[positionEmp][4].replace(",", "")

                        temp_1 = discount * float(item_list[positionItm][2])
                        emp_list[positionEmp][5] = temp_1 + float(emp_list[positionEmp][5])
                        temp_2 = float(item_list[positionItm][2]) - temp_1
                        emp_list[positionEmp][4] = temp_2 + float(emp_list[positionEmp][4])

                        emp_list[positionEmp][4] = "{:,.2f}".format(float(emp_list[positionEmp][4]))
                        emp_list[positionEmp][5] = "{:,.2f}".format(float(emp_list[positionEmp][5]))
                        return emp_list[positionEmp][4], emp_list[positionEmp][5]
            elif check_for_blanks(other_opt) is False or other_opt.isalpha() is False or other_opt.lower() != "y" and "n":
                print(error)


def main():
    entry = True
    while entry:
        menu = {
            1: "Create Employee     ",
            2: "Create Item         ",
            3: "Make Purchase       ",
            4: "All Employee Summary",
            5: "Exit                "
        }
        print("\n--------------------------------------------------------------------")
        for option in menu:
            print("|                    ", option, ": ", menu[option], end="                    |\n")
        print("--------------------------------------------------------------------")

        user_opt = input("Please enter an choice: ")
        if (check_for_blanks(user_opt) is False
                or check_for_int(user_opt) is False
                or user_opt != "1" and
                user_opt != "2" and
                user_opt != "3" and
                user_opt != "4" and
                user_opt != "5"):
            print("Please choose one!")
        elif user_opt == "1":
            print("error")
             # add_employee()
        elif user_opt == "2":
            print("error")
             # add_item()
        elif user_opt == "3":
            display_item()
        elif user_opt == "4":
            display_employee()
        elif user_opt == "5":
            print("See you later!!!")
            break


if __name__ == "__main__":
    main()
