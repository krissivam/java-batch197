create view view_no24 as

select * from view_no23 where "JML_MAHASISWA" = (
select max("JML_MAHASISWA") from view_no23
)

select * from view_no24
