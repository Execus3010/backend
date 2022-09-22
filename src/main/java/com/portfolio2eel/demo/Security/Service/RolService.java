
package com.portfolio2eel.demo.Security.Service;

import com.portfolio2eel.demo.Security.Enums.RolNombre;
import com.portfolio2eel.demo.Security.Repository.RolRepository;
import com.portfolio2eel.demo.Security.entity.Rol;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
