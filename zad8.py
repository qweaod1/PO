class Student:
    pass
class Marks:
    pass
student1 = Student()
marks1 = Marks()
print(isinstance(student1, Student))
print(isinstance(marks1, Marks))
print(isinstance(student1, Marks))
print(isinstance(marks1, Student))
print(issubclass(Student, object))
print(issubclass(Marks, object))