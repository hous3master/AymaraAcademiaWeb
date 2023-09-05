package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.ModuloDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Modulo;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IModuloService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class ModuloController {
    @Autowired
    private IModuloService myService;

    @PostMapping
    public void registrar(@RequestBody ModuloDTO dto) {
        ModelMapper m = new ModelMapper();
        Modulo myItem = m.map(dto, Modulo.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public ModuloDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ModuloDTO myItem = m.map(myService.listID(id), ModuloDTO.class);
        return myItem;
    }

    @GetMapping
    public List<ModuloDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ModuloDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Modulo dto) {
        ModelMapper m = new ModelMapper();
        Modulo d = m.map(dto, Modulo.class);
        myService.insert(d);
    }
}
