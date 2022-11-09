class Student:
    student_id = '162439'
    student_name = 'Piter'

print(f"Student Name: {getattr(Student, 'student_name')}")
print(f"Student id: {getattr(Student, 'student_id')}\n")

Student.student_class = '2IO'
for attr, values in Student.__dict__.items():
    if not attr.startswith('__'):
        print(f"{attr} -> {values}")
print("\n")
del Student.student_class
for attr, values in Student.__dict__.items():
    if not attr.startswith('__'):
        print(f"{attr} -> {values}")

