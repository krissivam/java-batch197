create view view_no30 as

select "NM_MAHASISWA", count("NIM") as "JML_MAHASISWA"
from mahasiswa 
where "NM_MAHASISWA" like '%Ratna%'
group by "NM_MAHASISWA"

select * from view_no30
