class Rectangle:
    def __init__(self, dlugosc, szerokosc):
        self.dlugosc = dlugosc
        self.szerokosc = szerokosc
    def pole(self):
        print(self.dlugosc*self.szerokosc)

prostokat = Rectangle(5,5)
prostokat.pole()