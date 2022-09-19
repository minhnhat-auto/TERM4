# Lab 12 - Parent class
class Mammal:
    # fields
    # age
    # __live_birth = True

    # Private properties are not accessible to derived classes
    def __init__(self, p_age):
        print("Constructor: Inside the Parent class constructor: Making the Mammal part of the object")
        self.age = p_age
        self.__live_birth = True

    def __del__(self):
        print("Destructor: The garbage collector is now deleting the Mammal part of the object")

    # Complex getter for height
    @property
    def live_birth(self):
        return self.__live_birth

    # Complex setter for height
    @live_birth.setter
    def height(self, p_live_birth):
        self.__live_birth = p_live_birth

    def love(self):
        print("This mammal is feeling love...")