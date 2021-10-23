import java.util.Scanner;

public class App {
    public static void main(String [] args){
        CaesarCipher myCipher = new  CaesarCipher();
        Scanner myScanner = new Scanner(System.in);
        String line = "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        String space = "                                                                          ";


        System.out.println(space);
        System.out.println("Type 'encrypt' or 'decrypt' to start :");
        String userChoice = myScanner.nextLine();

        if (userChoice.equals("encrypt")){
            System.out.println(line);
            System.out.println("Start typing phrase for encryption");
            String phraseToEncrypt = myScanner.nextLine();
            System.out.println(line);
            System.out.println("Enter shifting Key Value");
            int shiftIndexEncrypt = Integer.parseInt(myScanner.nextLine());
            System.out.println(line);
            System.out.println(myCipher.encrypt(phraseToEncrypt, shiftIndexEncrypt));
        }
        else if (userChoice.equals("decrypt")){
            System.out.println(space);
            System.out.println("Start typing phrase for decryption");
            String phraseToDecrypt = myScanner.nextLine();
            System.out.println(line);
            System.out.println("Enter shifting Key Value");
            int shiftIndexDecrypt = Integer.parseInt(myScanner.nextLine());
            System.out.println(line);
            System.out.println(myCipher.decrypt(phraseToDecrypt, shiftIndexDecrypt));

        }
        else {
            System.out.println(line);
            System.out.println("Invalid Input");
        }
    }
}