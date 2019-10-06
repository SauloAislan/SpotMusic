package br.com.sauloaislan.dao;

import br.com.sauloaislan.domain.Musica;

import java.util.List;

public interface MusicaDao {

    void salvar(Musica musica);
    List<Musica> recuperarPorPlaylist(long playlistId);
    Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);
    void atualizar(Musica musica);
    void excluir(long musicaId);

}
