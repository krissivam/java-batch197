create view view_no8 as
select j."NM_JURUSAN", count(mk."KD_MK") AS "JML_MK" 
from jurusan j
left join matakuliah mk on j."KD_JURUSAN" = mk."KD_JURUSAN"
group by j."NM_JURUSAN";

select * from view_no8
