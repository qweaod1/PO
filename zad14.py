import math
class Circle:
    def __init__(self, r):
        self.r = r
    def pole(self):
        print(math.pi*self.r**2)
    def obwod(self):
        print(2*math.pi*self.r)

circle = Circle(5)
circle.pole()
circle.obwod()