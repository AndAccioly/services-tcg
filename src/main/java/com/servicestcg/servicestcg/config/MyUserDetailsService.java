package com.servicestcg.servicestcg.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.servicestcg.servicestcg.entity.User;
import com.servicestcg.servicestcg.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private GrupoRepository grupos;

//    @Autowired
//    private PermissaoRepository permissoes;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User usuario = userRepository.findByUsername(username);
        System.out.println("AQUI");
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado!");
        }
        return new User();
    }
    
    
    public void createUser(UserDetails user) { 
        userRepository.save((User) user); 
     } 

//    public Collection<? extends GrantedAuthority> authorities(Usuario usuario) {
//        return authorities(grupos.findByUsuariosIn(Lists.newArrayList(usuario)));
//    }
//
//    public Collection<? extends GrantedAuthority> authorities(List<Grupo> grupos) {
//        Collection<GrantedAuthority> auths = new ArrayList<>();
//
//        for (Grupo grupo: grupos) {
//            List<Permissao> lista = permissoes.findByGruposIn(Lists.newArrayList(grupo));
//
//            for (Permissao permissao: lista) {
//                auths.add(new SimpleGrantedAuthority("ROLE_" + permissao.getNome()));
//            }
//        }
//
//        return auths;
//    }

}
