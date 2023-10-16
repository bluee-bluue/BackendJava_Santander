package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin() == null){
            throw new CampoObrigatorioException("Login");
        }

        if (usuario.getSenha() == null) {
            throw new CampoObrigatorioException("Senha");
        }

        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }
        else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println("ID: " + id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários no sistema");

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("caique", "admin"));
        usuarios.add(new Usuario("joao", "admin"));

        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário%n", id);

        return new Usuario("caique", "admin");
    }

    public Usuario findByUsername(String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar um usuário%n", username);

        return new Usuario("caique", "admin");
    }
}
