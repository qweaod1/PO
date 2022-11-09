class Student:
    def __init__(self, student_name, student_class, student_id):
        self.student_name = student_name
        self.student_class = student_class
        self.student_id = student_id
    def __str__(self):
        return f"{self.student_name} {self.student_class} {self.student_id}"
    @staticmethod
    def student_data(student_id, student_class=None, student_name=None):
        if(student_class==None and student_name==None):
            return f"{student_id}"
        else:
            return f"{student_name} {student_class}"


student = Student("Piotr", '2IO', '162439')
print(student)
print(student.student_data(None, '2IO', 'Piotr'))
