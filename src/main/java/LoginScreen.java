import java.util.HashMap;
import java.util.Map;

/**
 * Classe de uma tela de login
 * @author Felipe Lima
 * @version 1.0
 */
public class LoginScreen {

    private Map<String, String> userDatabase; // Define o array, semelhante a uma tabela

    /**
     * Constructor
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("flima","123"); // Insere esse user no HashMap
    }

    /**
     * Verifica se o usuário existe
     * @param nomeUsuario String
     * @param senhaUsuario String
     * @return boolean
     */
    public boolean login(String nomeUsuario,String senhaUsuario) {
        if(userDatabase.containsKey(nomeUsuario)) {
            String storePassword = userDatabase.get(nomeUsuario);
            // Verifica se a senha é a igual salva no array
            if(storePassword.equals(senhaUsuario)) {
                return true;
            }
        }
        return false;
    }
}
