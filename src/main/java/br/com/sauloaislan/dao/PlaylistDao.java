package br.com.sauloaislan.dao;

import br.com.sauloaislan.domain.Playlist;

import java.util.List;

public interface PlaylistDao {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorID(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);

}
