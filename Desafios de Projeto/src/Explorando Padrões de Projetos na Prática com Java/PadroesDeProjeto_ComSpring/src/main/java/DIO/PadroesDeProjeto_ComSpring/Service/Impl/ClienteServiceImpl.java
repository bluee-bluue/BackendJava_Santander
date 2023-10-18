package DIO.PadroesDeProjeto_ComSpring.Service.Impl;

import DIO.PadroesDeProjeto_ComSpring.Model.Cliente;
import DIO.PadroesDeProjeto_ComSpring.Model.ClienteRepository;
import DIO.PadroesDeProjeto_ComSpring.Model.Endereco;
import DIO.PadroesDeProjeto_ComSpring.Model.EnderecoRepository;
import DIO.PadroesDeProjeto_ComSpring.Service.ClienteService;
import DIO.PadroesDeProjeto_ComSpring.Service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    // TODO Singleton: Injetar dos componentes do Spring com @Autowired
    // TODO Strategy: Implementar os métodos definidos na interface
    // TODO Facade: Abstrair integrações com subsistemas, promovendo uma interface simples

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        // FIXME: Buscar todos os Clientes
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // FIXME: Buscar Cliente por ID
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCEP(cliente);
    }

    private void salvarClienteComCEP(Cliente cliente) {
        // FIXME: Verificar se o Endereço do Cliente já existe (pelo CEP)

        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // FIXME: Caso não exista, integrar com o ViaCEP e persistir o retorno
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);

        // FIXME: Inserir Cliente, vinculando o Endereço (novo ou existente)
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // FIXME: Buscar Cliente por ID, caso exista
        Optional<Cliente> clienteBD = clienteRepository.findById(id);
        if (clienteBD.isPresent()) {
            // FIXME: Verificar se o Endereço do Cliente já existe (pelo CEP)
            // FIXME: Caso não exista, integrar com o ViaCEP e persistir o retorno
            // FIXME: Alterar Cliente, vinculando o Endereço (novo ou existente)
            salvarClienteComCEP(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // FIXME: Deletar Cliente por ID
        clienteRepository.deleteById(id);
    }
}
