public class warmUps {
    public static void main(String[] args){
        /*Create three boolean variables
                livesInCity
                hasTransportation
                canComeInPerson (the value you get will be a boolean expression using the previous two)
        Write an if statement that prints a message stating whether or not someone can come in person.*/
            boolean livesInCity = false;
            boolean hasTransportation = true;
            boolean canComeInPerson = livesInCity || hasTransportation;

                    if(canComeInPerson){
                        System.out.println("You are able to come in person");
                    } else {
                        System.out.println("You may want to consider virtual options")
                    }

//            if (livesInCity = true || livesInCity = false && hasTransportation = true){
//                System.out.println("You are able to come in person!");
//            } else {
//                System.out.println("You may want to consider going virtual options")
//            }

    }
    }
