package pe.edu.upc.aaw.aymaraacademia.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.aymaraacademia.entities.Video;
import pe.edu.upc.aaw.aymaraacademia.repositories.IVideoRepository;
import pe.edu.upc.aaw.aymaraacademia.serviceinterfaces.IVideoService;

import java.util.List;
@Service
public class VideoServiceImplement implements IVideoService {
    @Autowired
    private IVideoRepository myRepository;

    // Add an item to table
    @Override
    public void insert(Video nombreTabla) {
        myRepository.save(nombreTabla);
    }

    // Delete an item by ID on table
    @Override
    public void delete(int idVideo){
        myRepository.deleteById(idVideo);
    }

    // Retrieve an items by ID from table
    @Override
    public Video listId(int idVideo){
        return myRepository.findById(idVideo).orElse(new Video());
    }

    // Retrieve all items from table
    @Override
    public List<Video> list() {
        return myRepository.findAll();
    }
}
