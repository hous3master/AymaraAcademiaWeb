package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.LecturaDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Lectura;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.ILecturaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class LecturaController {
    @Autowired
    private ILecturaService myService;

    @PostMapping
    public void registrar(@RequestBody LecturaDTO dto) {
        ModelMapper m = new ModelMapper();
        Lectura myItem = m.map(dto, Lectura.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public LecturaDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        LecturaDTO myItem = m.map(myService.listID(id), LecturaDTO.class);
        return myItem;
    }

    @GetMapping
    public List<LecturaDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LecturaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Lectura dto) {
        ModelMapper m = new ModelMapper();
        Lectura d = m.map(dto, Lectura.class);
        myService.insert(d);
    }
}
