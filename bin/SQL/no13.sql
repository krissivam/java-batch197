create view view_no13 as
select d."ALAMAT" as "NM_KOTA", count(d."KD_DOSEN") AS "JML_DOSEN" 
from dosen d
group by d."ALAMAT"

select * from view_no13
