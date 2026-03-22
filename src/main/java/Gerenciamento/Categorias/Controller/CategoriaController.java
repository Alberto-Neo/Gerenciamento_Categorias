package Gerenciamento.Categorias.Controller;

import Gerenciamento.Categorias.Models.CategoriaModel;
import Gerenciamento.Categorias.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaModel> Listar() {
        return categoriaService.listar();
    }

    @PostMapping
    public CategoriaModel criar(@RequestBody CategoriaModel categoriaModel) {
        return categoriaService.criar(categoriaModel);
    }

    @GetMapping("/{id}")
    public CategoriaModel buscar(@PathVariable Long id) {
        return categoriaService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        categoriaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
