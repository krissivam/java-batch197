create view view_no4 as
select f."NM_FAKULTAS", f."KD_FAKULTAS", count(j."KD_JURUSAN") AS "JML_JURUSAN" 
from fakultas f
left join jurusan j on f."KD_FAKULTAS" = j."KD_FAKULTAS"
group by f."NM_FAKULTAS", f."KD_FAKULTAS";

select * from view_no4
