create or replace view view_no11 as
select f."NM_FAKULTAS", j."NM_JURUSAN", count(mk."KD_JURUSAN") as "JML_MK"
from fakultas f
left join jurusan j 
on f."KD_FAKULTAS" = j."KD_FAKULTAS"
left join matakuliah mk
on j."KD_JURUSAN" = mk."KD_JURUSAN"
group by f."NM_FAKULTAS", j."NM_JURUSAN"
having count(mk."KD_JURUSAN") = 0

select * from view_no11
