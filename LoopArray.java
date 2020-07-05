public class LoopArray {
    public static void main(String[] args) {
        
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "A";
        users[2] = "B";

        for(int i = 0 ; i<users.length ; i++){
            System.out.println("<li>" + users[i]  +"</li>");
        }


    }
}