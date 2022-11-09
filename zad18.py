class Shape:
    def area(self, ksztalt=0):
        return ksztalt
class Square(Shape):
    def __init__(self, dlugosc):
        self.dlugosc = dlugosc
    def area(self, ksztalt=0):
        return ksztalt

