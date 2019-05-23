create view view_no28 as

select "JK", count("NIM") as "JML_MAHASISWA"
from mahasiswa
group by "JK"

select * from view_no28
