package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.CursoDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Curso;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.ICursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class CursoController {
    @Autowired
    private ICursoService myService;

    @PostMapping
    public void registrar(@RequestBody CursoDTO dto) {
        ModelMapper m = new ModelMapper();
        Curso myItem = m.map(dto, Curso.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public CursoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        CursoDTO myItem = m.map(myService.listID(id), CursoDTO.class);
        return myItem;
    }

    @GetMapping
    public List<CursoDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CursoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Curso dto) {
        ModelMapper m = new ModelMapper();
        Curso d = m.map(dto, Curso.class);
        myService.insert(d);
    }
}
