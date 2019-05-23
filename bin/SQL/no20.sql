create view view_no20 as
select "NM_RUANG", "KAPASITAS"
from tabel_ruang 
where "KAPASITAS" = (select max("KAPASITAS") from tabel_ruang)

select * from view_no20
