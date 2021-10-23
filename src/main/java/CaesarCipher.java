public class CaesarCipher {
    private StringBuffer result = new StringBuffer();
    private String resultString = new String();

    public StringBuffer getResult() {
        return result;
    }

    public String getResultString() {
        return resultString;
    }

    public String encrypt(String userPhrase, int shiftKey){



        for (int i=0; i<userPhrase.length(); i++){

            if (Character.isUpperCase(userPhrase.charAt(i))){

                char userChars = (char)(((int)userPhrase.charAt(i) + shiftKey - 65)% 26 + 65);
                result.append(userChars);
                resultString = result.toString();
            }
            else{
                char userChars = (char)(((int)userPhrase.charAt(i) + shiftKey -97)% 26 + 97);
                result.append(userChars);
                resultString = result.toString();
            }
        }
        return resultString;
    }
    public String decrypt(String phraseForCaesarCipher, int shiftIndex){
        return encrypt(phraseForCaesarCipher, 26 - shiftIndex);
    }
}