create view view_no18 as
SELECT SUM("KAPASITAS") as "TOTAL_KAPASITAS"
FROM tabel_ruang;

select * from view_no18
