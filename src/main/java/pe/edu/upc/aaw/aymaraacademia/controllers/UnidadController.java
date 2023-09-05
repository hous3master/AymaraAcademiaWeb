package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.UnidadDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Unidad;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IUnidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class UnidadController {
    @Autowired
    private IUnidadService myService;

    @PostMapping
    public void registrar(@RequestBody UnidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Unidad myItem = m.map(dto, Unidad.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public UnidadDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        UnidadDTO myItem = m.map(myService.listID(id), UnidadDTO.class);
        return myItem;
    }

    @GetMapping
    public List<UnidadDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UnidadDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Unidad dto) {
        ModelMapper m = new ModelMapper();
        Unidad d = m.map(dto, Unidad.class);
        myService.insert(d);
    }
}
