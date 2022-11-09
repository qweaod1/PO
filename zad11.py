class Student:
    name = 'Kamil'
    school = 'UWM WMiI'

student_1 = Student()
student_2 = Student()
student_1.name = 'Banana'
student_1.school = 'Uniwersytet warminsko mazurski'
student_2.name = 'Orange'
student_2.school = 'School'
students = [student_1, student_2]
for student in students:
    for attr in student.__dict__:
        print(f"{attr} -> {getattr(student, attr)}")
