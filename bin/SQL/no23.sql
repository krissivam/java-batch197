create or replace view view_no23 as
SELECT j."NM_JURUSAN", f."NM_FAKULTAS",count(mhs."NIM") AS "JML_MAHASISWA"
FROM jurusan j
INNER JOIN mahasiswa mhs ON j."KD_JURUSAN" = mhs."KD_JURUSAN"
INNER JOIN fakultas f ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
GROUP BY j."NM_JURUSAN", f."NM_FAKULTAS"

select * from view_no23 