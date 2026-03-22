package Gerenciamento.Categorias.Services;

import Gerenciamento.Categorias.Models.CategoriaModel;
import Gerenciamento.Categorias.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<CategoriaModel> listar(){
        return categoriaRepository.findAll();
    }

    public CategoriaModel buscar(Long id){
        return categoriaRepository.findById(id).get();
    }

    public CategoriaModel criar(CategoriaModel categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }
}
