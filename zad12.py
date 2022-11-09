class Test:
    def __init__(self):
        self.napis = ""
    def get_string(self):
        self.napis = input()
    def print_string(self):
        print(self.napis.upper())

napis1 = Test()
napis1.get_string()
napis1.print_string()

