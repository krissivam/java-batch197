create view view_no26 as
select f."NM_FAKULTAS", j."NM_JURUSAN", count(mhs."NIM") as "JML_MAHASISWA"
from fakultas f
left join jurusan j 
on f."KD_FAKULTAS" = j."KD_FAKULTAS"
left join mahasiswa mhs
on j."KD_JURUSAN" = mhs."KD_JURUSAN"
group by f."NM_FAKULTAS", j."NM_JURUSAN"
having count(mhs."NIM") = 0

select * from view_no26
