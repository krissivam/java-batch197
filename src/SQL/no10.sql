create or replace view view_no10 as
select j."NM_JURUSAN", count(mk."KD_MK") AS "JML_MK" 
from jurusan j
left join matakuliah mk on mk."KD_JURUSAN" = j."KD_JURUSAN"
where mk."SKS" = '3'
group by j."NM_JURUSAN"

select * from view_no10