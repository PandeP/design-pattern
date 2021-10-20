package factory.pattern;

import factory.pattern.patternService.FactoryPattern;

public class MainFactoryPattern {

    public static void main (String[] args)
    {
        System.out.println("Hello");
        FactoryPattern fp = new FactoryPattern();
        fp.personType.apply("Teacher");
    }
}
