package pe.edu.upc.aaw.aymaraacademia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.aymaraacademia.dtos.VideoDTO;
import pe.edu.upc.aaw.aymaraacademia.entities.Video;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IVideoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private IVideoService myService;

    @PostMapping
    public void registrar(@RequestBody VideoDTO dto) {
        ModelMapper m = new ModelMapper();
        Video myItem = m.map(dto, Video.class);
        myService.insert(myItem);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    @GetMapping("/{id}")
    public VideoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        VideoDTO myItem = m.map(myService.listId(id), VideoDTO.class);
        return myItem;
    }

    @GetMapping
    public List<VideoDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VideoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Video dto) {
        ModelMapper m = new ModelMapper();
        Video d = m.map(dto, Video.class);
        myService.insert(d);
    }
}
