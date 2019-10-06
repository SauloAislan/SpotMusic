package br.com.sauloaislan.service;

import br.com.sauloaislan.domain.Musica;

import java.util.List;

public interface MusicaService {

    void salvar(Musica musica, long playlistId);
    List<Musica> recuperarPorPlaylist(long playlistID);
    Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);
    void atualizar(Musica musica, long playlistId);
    void excluir(long playlistId, long musicaId);

}
