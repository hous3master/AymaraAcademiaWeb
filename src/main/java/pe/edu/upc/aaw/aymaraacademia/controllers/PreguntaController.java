package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.PreguntaDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Pregunta;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IPreguntaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {
    @Autowired
    private IPreguntaService myService;

    @PostMapping
    public void registrar(@RequestBody PreguntaDTO dto) {
        ModelMapper m = new ModelMapper();
        Pregunta myItem = m.map(dto, Pregunta.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public PreguntaDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        PreguntaDTO myItem = m.map(myService.listId(id), PreguntaDTO.class);
        return myItem;
    }

    @GetMapping
    public List<PreguntaDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Pregunta dto) {
        ModelMapper m = new ModelMapper();
        Pregunta d = m.map(dto, Pregunta.class);
        myService.insert(d);
    }
}
