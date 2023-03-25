package co.edu.uniquindio.biblioteca.dto;

import java.util.List;

public record LibroIsbnDTO(List<String> isbnEncontrados, List<String> noEncontrados) {
}
