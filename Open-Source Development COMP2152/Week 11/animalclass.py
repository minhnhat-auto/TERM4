class MyAnimal:

  def __init__(self, Name='', Gender='', Weight=0, Height=0):
    self.name = Name
    self.gender = Gender
    self.__weight = Weight
    self.__height = Height
	
	
class MyDog (MyAnimal):
  def __init__(self, Name='', Gender='', Weight=0, Height=0, Teeth=0):
    MyAnimal.__init__(self, Name, Gender, Weight, Height)
    self.teeth = Teeth