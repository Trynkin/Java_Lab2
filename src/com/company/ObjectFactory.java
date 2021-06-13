package com.company;

public class ObjectFactory {
  //  private static ObjectFactory objectFactoryInstance;

   /** private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        if (objectFactoryInstance == null) {
            objectFactoryInstance = new ObjectFactory();
        }
        return objectFactoryInstance;
    } */

    public Command getCommand(String factoryEnum) {
        switch (factoryEnum) {
            case "PUSH": {
                return new Push();
            }
            case "POP": {
                return new Pop();
            }
            case "+": {
                return new Add();
            }
            case "*":{
                return new Mult();
            }
            case "DEFINE": {
                return new Def();
            }
            case "/": {
                return new Div();
            }
            case "-":{
                return new Diff();
            }
            case "SQRT":{
                return new Sqrt();
            }
            case "PRINT":{
                return new Print();
            }
            default: {
                return null;
            }
        }
    }
}