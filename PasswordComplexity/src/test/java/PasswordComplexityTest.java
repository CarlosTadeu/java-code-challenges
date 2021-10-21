import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordComplexityTest {

   @Test
   public void isPasswordComplex_true() {
       assertTrue(PasswordComplexity.isPasswordComplexRegex("Happy12"));
       assertTrue(PasswordComplexity.isPasswordComplexRegex("1SarahL ength"));
       assertTrue(PasswordComplexity.isPasswordComplexRegex("Password12"));
       assertTrue(PasswordComplexity.isPasswordComplexRegex("2PassW@ord1"));
       assertTrue(PasswordComplexity.isPasswordComplexRegex("01Sall#y9"));
   }

   @Test
   public void isPasswordComplex_false() {
       assertFalse(PasswordComplexity.isPasswordComplexRegex("12aB "));
       assertFalse(PasswordComplexity.isPasswordComplexRegex("Ab112"));
       assertFalse(PasswordComplexity.isPasswordComplexRegex("happy"));
       assertFalse(PasswordComplexity.isPasswordComplexRegex("happy_1"));
       assertFalse(PasswordComplexity.isPasswordComplexRegex("p assword12"));
       assertFalse(PasswordComplexity.isPasswordComplexRegex("Sur18"));
       assertFalse(PasswordComplexity.isPasswordComplexRegex(""));
   }
}
