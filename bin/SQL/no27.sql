create view view_no27 as
select "ALAMAT" as "NM_KOTA", count("NIM") as "JML_MAHASISWA"
from mahasiswa
group by "ALAMAT"

select * from view_no27
