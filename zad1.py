import array
print("Zad1\n")
for name in array.__dict__:
    print(name)

print("\nZad2\n")
class Zad2:
    def __init__(self, imie):
        self.imie = imie
    def wyswietl(self, imie):
        return imie

for name in Zad2.__dict__:
    print(name)

print("\nZad3\n")
imie = Zad2('Piotr')
print(imie.__dict__)