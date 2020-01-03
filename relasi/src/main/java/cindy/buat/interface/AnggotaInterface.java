package cindy.buat.interface;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import cindy.buat.model.Anggota;

public interface AnggotaInterface {

    Long size();
    List<Anggota> findAll (int page, int limit);
    Anggota findById (@NotNull Long id);
    boolean save(@NotNull Anggota anggota);
    boolean update(@NotNull Long id, @NotBlank String name,@NotBlank String email, @NotBlank String password, @NotBlank String data); // @NotNull int grade);
    boolean destroy(@NotNull Long id);
}