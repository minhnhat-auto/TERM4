# Lab 11 - Create the Person class
class Person:
    # Constructor
    def __init__(self, p_name, p_age, p_height):
        print("Constructing the person object")
        self.name = p_name
        self.age = p_age
        self.height = p_height

    # Getter for name: version 1
    @property
    def name(self):
        return self.name

    # Setter for name: version 1
    @name.setter
    def name(self, new_name):
       self.name = new_name

    def __del__(self):
        print("The garbage collector is automatically destroying the person object")

person1 = Person("Mark", 20, 6)

# version 1
print("The name of the person is: " + str(person1.name))
person1.name = "Alfred"
print("The name of the person is: " + str(person1.name))
print("private: " + str(person1.__name))


# version 2
#print("The name of the person is: " + str(person1.get_name()))
#person1.set_name("Alfred")
#print("The name of the person is: " + str(person1.get_name()))