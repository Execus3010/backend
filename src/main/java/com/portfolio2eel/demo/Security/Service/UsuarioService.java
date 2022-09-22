package com.portfolio2eel.demo.Security.Service;

import com.portfolio2eel.demo.Security.Repository.iUsuarioRepository;
import com.portfolio2eel.demo.Security.entity.Usuario;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    
    public boolean existsByNombreUsurio (String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    
      public boolean existsByEmail (String email){
        return iusuarioRepository.existsByEmail(email); 
    
    }
      
      public void save(Usuario usuario){
          iusuarioRepository.save(usuario);
      }
      
}