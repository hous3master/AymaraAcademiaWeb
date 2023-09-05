package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.QuizzDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Quizz;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IQuizzService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quizz")
public class QuizzController {
    @Autowired
    private IQuizzService myService;

    @PostMapping
    public void registrar(@RequestBody QuizzDTO dto) {
        ModelMapper m = new ModelMapper();
        Quizz myItem = m.map(dto, Quizz.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public QuizzDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        QuizzDTO myItem = m.map(myService.listId(id), QuizzDTO.class);
        return myItem;
    }

    @GetMapping
    public List<QuizzDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, QuizzDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Quizz dto) {
        ModelMapper m = new ModelMapper();
        Quizz d = m.map(dto, Quizz.class);
        myService.insert(d);
    }
}
