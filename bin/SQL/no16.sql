create view view_no16 as
select d."NM_DOSEN", count(mk."KD_MK") AS "JML_MK" 
from dosen d
inner join kelas k
on d."KD_DOSEN" = k."KD_DOSEN"
inner join matakuliah mk
on k."KD_MK" = mk."KD_MK"
group by d."NM_DOSEN";

select * from view_no16
