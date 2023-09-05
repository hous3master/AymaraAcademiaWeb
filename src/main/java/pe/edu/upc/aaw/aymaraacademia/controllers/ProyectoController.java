package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.ProyectoDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Proyecto;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IProyectoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class ProyectoController {
    @Autowired
    private IProyectoService myService;

    @PostMapping
    public void registrar(@RequestBody ProyectoDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyecto myItem = m.map(dto, Proyecto.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public ProyectoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ProyectoDTO myItem = m.map(myService.listID(id), ProyectoDTO.class);
        return myItem;
    }

    @GetMapping
    public List<ProyectoDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProyectoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Proyecto dto) {
        ModelMapper m = new ModelMapper();
        Proyecto d = m.map(dto, Proyecto.class);
        myService.insert(d);
    }
}
