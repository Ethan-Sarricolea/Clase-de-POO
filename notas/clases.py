"""

"""

class Person:
    def __init__(self,name="desconocido",age=1,alive=False) -> None:
        self.name = name.upper()
        self.age = age
        self.alive = alive

    def talk(self):
        print(f"{self.name} dice: Hola")
    

    def set_name(self,new):
        self.name = new.upper()

    def get_name(self):
        return self.name


persona1 = Person("pedro",18,True)
persona1.talk()
print(f"El nombre de la persona 1 es: {persona1.get_name()}")
persona1.set_name("pepe")
persona1.talk()
print(f"El nombre de la persona 1 es: {persona1.get_name()}")