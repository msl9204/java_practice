public class AuthApp {
    public static void main(String args[]) {

        String id = "egoing";
        String inputId = args[0];

        String password = "111111";
        String inputPass = args[1];

        System.out.println("HI");


        // if(inputId == id){
        if(inputId.equals(id) && inputPass.equals(password)){
                System.out.println("Master!");

        } else {
            System.out.println("Who are you?");
        }


    }
}