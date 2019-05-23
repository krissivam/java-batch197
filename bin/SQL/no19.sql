create view view_no19 as
select tr."NM_RUANG", tr."KAPASITAS"
from tabel_ruang tr
where "KAPASITAS" = (select min("KAPASITAS") from tabel_ruang)

select * from view_no19
