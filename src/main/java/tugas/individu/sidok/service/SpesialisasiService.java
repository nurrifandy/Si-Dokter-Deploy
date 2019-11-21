package tugas.individu.sidok.service;

import java.util.List;
import java.util.Optional;

import tugas.individu.sidok.model.SpesialisasiModel;

public interface SpesialisasiService{
    void addSpesialisasi(SpesialisasiModel spesialisasi);

    List<SpesialisasiModel> getSpesialisasiList();

    Optional<SpesialisasiModel> getSpesialisasiById(Long idSpesialisasi);
}