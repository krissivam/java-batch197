create view view_no25 as

select * from view_no23 where "JML_MAHASISWA" = (
select min("JML_MAHASISWA") from view_no23
)

select * from view_no25
