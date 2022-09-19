from mammal import Mammal


# Lab 12 - Child can inherit only public fields from the parent
class Puma(Mammal):
    # fields from Parent
    # age

    # fields
    # __tail_length
    # sharp_claws
    def __init__(self, p_age, p_tail_length):
        print("Constructor: Inside the Child class constructor: Adding the Person parts of a person")
        # Lab 12 - Call the parent class constructor
        Mammal.__init__(self, p_age)

        # Set the Person-specific fields
        self.__tail_length = p_tail_length
        self.sharp_claws = True

    def __del__(self):
        print("Destructor: The garbage collector is now deleting the Puma part of the object")
        super(Puma, self).__del__()
