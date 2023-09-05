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
    private IVideoRepository vR;
    @Override
    public void insert(Video video) {
        vR.save(video);
    }

    @Override
    public List<Video> list() {

        return vR.findAll();
    }

    @Override
    public void delete(int ID) {
        vR.deleteById(ID);
    }

    @Override
    public void update(Video video) {
        vR.save(video);
    }

    @Override
    public Video listID(int ID) {

        return vR.findById(ID).orElse(new Video());
    }
}
