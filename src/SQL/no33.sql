create view view_no33 as

select mhs."NIM", mhs."NM_MAHASISWA", j."NM_JURUSAN", f."NM_FAKULTAS", mk."NM_MK", count(mk."SKS" * tbn."BOBOT") as "BOBOT_NILAI"
from mahasiswa mhs
inner join jurusan j on mhs."KD_JURUSAN" = j."KD_JURUSAN"
inner join fakultas f on j."KD_FAKULTAS" = f."KD_FAKULTAS"
inner join matakuliah mk on j."KD_JURUSAN" = mk."KD_JURUSAN"
inner join kelas_detail kd on mhs."NIM" = kd."NIM"
inner join tabel_bobot_nilai tbn on kd."NILAI" = tbn."NILAI"

order by mhs."NIM"

select * from view_no33
