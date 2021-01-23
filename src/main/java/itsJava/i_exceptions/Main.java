package itsJava.i_exceptions;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya");
        try{
            person.setName("");
        } catch (IncorrectUsernameException incorrectUsernameException){
            System.out.println("Incorrect name!");
        } finally {
            System.out.println("Incorrect name caught!");
        }
        try{
            try{
                person.setAge(-10);
            } catch (IncorrectAgeException incorrectAgeException) {
                throw new IncorrectUsernameException();
            } finally {
                System.out.println("Caught age, but will throw name exception!");
            }
        } catch (IncorrectUsernameException incorrectUsernameException) {
            System.out.println("Processing fake name exception!");
        } finally {
            System.out.println("Job is done)");
        }
    }
}
