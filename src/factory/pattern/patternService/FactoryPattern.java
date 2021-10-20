package factory.pattern.patternService;

import factory.pattern.model.Person;
import factory.pattern.model.Student;
import factory.pattern.model.Teacher;

import java.util.function.Function;

public class FactoryPattern {

    public Function<String,Person> personType = s -> s.equals("Student")? new Student("Aviral"): new Teacher("Pranav");

}
