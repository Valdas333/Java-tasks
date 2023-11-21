package template.method;

abstract class Greeter {


    public void greet(String name,String lastname){

        System.out.println(getGreetingString() + " " + name + " " + lastname);
    }

    abstract protected String getGreetingString();

}

