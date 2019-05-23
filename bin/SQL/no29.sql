create view view_no29 as

select "NM_MAHASISWA", count("NIM") as "JML_MAHASISWA"
from mahasiswa 
where "NM_MAHASISWA" like '%Desi%'
group by "NM_MAHASISWA"

select * from view_no29
