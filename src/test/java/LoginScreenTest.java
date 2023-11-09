import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
/**
 * Classe para teste e simulação de uma tela de login
 * @author Felipe Lima
 * @version 1.0
 */
public class LoginScreenTest {

    @Test
    @DisplayName("Verifica se o usuário existe")
    public void verificaUsuarioExiste() {
        LoginScreen loginScreen = new LoginScreen();
        Assertions.assertTrue(loginScreen.login("flima","123")); // Realiza teste
    }

    @Test
    @DisplayName("Verifica se o usuário não existe")
    public void verificaUsuarioNaoExiste() {
        LoginScreen loginScreen = new LoginScreen();
        Assertions.assertFalse(loginScreen.login("flima","102910291")); // Realiza teste
    }
}