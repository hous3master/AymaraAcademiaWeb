package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.AlternativaDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Alternativa;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IAlternativaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alternativa")
public class AlternativaController {
    @Autowired
    private IAlternativaService myService;

    @PostMapping
    public void registrar(@RequestBody AlternativaDTO dto) {
        ModelMapper m = new ModelMapper();
        Alternativa myItem = m.map(dto, Alternativa.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public AlternativaDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        AlternativaDTO myItem = m.map(myService.listId(id), AlternativaDTO.class);
        return myItem;
    }

    @GetMapping
    public List<AlternativaDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AlternativaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Alternativa dto) {
        ModelMapper m = new ModelMapper();
        Alternativa d = m.map(dto, Alternativa.class);
        myService.insert(d);
    }
}
