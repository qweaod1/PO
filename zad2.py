print("\nZad2\n")
class Zad2:
    def __init__(self, imie):
        self.imie = imie
    def wyswietl(self, imie):
        return imie

for name in Zad2.__dict__:
    print(name)
