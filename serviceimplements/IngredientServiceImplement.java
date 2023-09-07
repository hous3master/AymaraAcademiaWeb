package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Ingredient;
import pe.edu.upc.aaw.demo01.repositories.IIngredientRepository;
import pe.edu.upc.aaw.demo01.serviceinterfaces.IIngredientService;

import java.util.List;
@Service
public class IngredientServiceImplement implements IIngredientService {
    @Autowired
    private IIngredientRepository iR;
    @Override
    public void insert(Ingredient ingredient) {
        iR.save(ingredient);
    }

    @Override
    public List<Ingredient> List() {
        return iR.findAll();
    }
}
