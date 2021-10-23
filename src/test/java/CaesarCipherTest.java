import org.junit.Test;



import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void CaeserCipher_instanceOf_Object() {
        CaesarCipher testCaeserCipher = new CaesarCipher();
        assertTrue(testCaeserCipher instanceof CaesarCipher);
    }

    @Test
    public void CaeserCipher_takeStringInput_string(){
        CaesarCipher testCaeserCipher = new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "tomorrow";
        assertEquals(expectedOutput, testCaeserCipher.doCaesarCipher("pkiknnks", 4));
    }


    @Test
    public void CaeserCipher_doEncryption_string(){
        CaesarCipher testCaeserCipher =new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "tomorrow";
        assertEquals(expectedOutput, testCaeserCipher.doCaesarCipher("pkiknnks", 4));
    }

    @Test
    public void CaeserCipher_unDoDecryption_string(){
        CaesarCipher testCaeserCipher = new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "pkiknnks";
        assertEquals(expectedOutput, testCaeserCipher.unDoCaeserCipher( "tomorrow", 4));
    }

    @Test
    public void CaeserCipher_enableUpperCaseInput(){
        CaesarCipher testCaeserCipher = new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "TOMORROW";
        assertEquals(expectedOutput, testCaeserCipher.doCaesarCipher("PKIKNNKS", 4) );
    }
}