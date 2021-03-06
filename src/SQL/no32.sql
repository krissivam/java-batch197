create or replace view view_no32 as

select mhs."NIM", mhs."NM_MAHASISWA", j."NM_JURUSAN", f."NM_FAKULTAS", mk."NM_MK", mk."SKS", tbn."BOBOT" as "BOBOT_NILAI"
from mahasiswa mhs
inner join kelas_detail kd on mhs."NIM" = kd."NIM"
inner join tabel_bobot_nilai tbn on kd."NILAI" = tbn."NILAI"
inner join kelas k on kd."KD_KELAS" = k."KD_KELAS"
inner join matakuliah mk on k."KD_MK" = mk."KD_MK"
inner join jurusan j on mk."KD_JURUSAN" = j."KD_JURUSAN"
inner join fakultas f on j."KD_FAKULTAS" = f."KD_FAKULTAS"

order by mhs."NIM"

select * from view_no32
