package br.com.fatecmogidascruzes.topicos.utils.mapper;

public interface ObjectMapper<O,T> {

    O toObject(T dto);
    T toDTO(O object);
}
