class Student:
    name = 'Piter'
    school = 'UWM WMiI'

student_1 = Student()
student_2 = Student()
student_1.name = 'Mango'
student_1.school = 'School at Bahamas'
student_2.name = 'Potato'
student_2.school = 'School at Pole'
students = [student_1, student_2]
for student in students:
    for attr in student.__dict__:
        print(f"{attr} -> {getattr(student, attr)}")
