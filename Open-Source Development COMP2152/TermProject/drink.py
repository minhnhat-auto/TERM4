class Drink:
    def __init__(self, d_name, d_price):
        self.drink_name = d_name
        self.drink_price = d_price
        self.drink_counter = 0

    @property
    def drink_counter(self):
        return self.drink_counter

    @drink_counter.setter
    def drink_counter(self, d_counter):
        self.drink_counter = d_counter

