package tcc.orcatudo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tcc.orcatudo.repository.UsuarioRepository;



@Service
public class UsuarioDetailsService implements UserDetailsService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(username)
        .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado" + username ));
    }

}
