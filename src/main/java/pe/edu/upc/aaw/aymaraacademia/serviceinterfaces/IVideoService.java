package pe.edu.upc.aaw.aymaraacademia.serviceinterfaces;

import pe.edu.upc.aaw.aymaraacademia.entities.Video;

import java.util.List;

public interface IVideoService {
    public void insert(Video video);
    List<Video> list();
    public void delete(int ID);
    public void update(Video video);
    public Video listID(int ID);
}
