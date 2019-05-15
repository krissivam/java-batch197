create view view_no22 as
select mhs."NIM", mhs."NM_MAHASISWA", j."NM_JURUSAN", f."NM_FAKULTAS"
from mahasiswa mhs
inner join jurusan j
on mhs."KD_JURUSAN" = j."KD_JURUSAN"
inner join fakultas f
on j."KD_FAKULTAS" = f."KD_FAKULTAS"


select * from view_no22
