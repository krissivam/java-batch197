create view view_no5 as
select f."NM_FAKULTAS", count(j."KD_JURUSAN") AS "JML_JURUSAN" 
from fakultas f
left join jurusan j on f."KD_FAKULTAS" = j."KD_FAKULTAS"
group by f."NM_FAKULTAS"
having count(j."KD_JURUSAN") > 1

select * from view_no5
