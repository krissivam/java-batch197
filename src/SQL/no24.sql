create view view_no24 as
SELECT j."NM_JURUSAN", f."NM_FAKULTAS",count(mhs."NIM") AS "JML_MAHASISWA"
FROM jurusan j
LEFT JOIN mahasiswa mhs ON j."KD_JURUSAN" = mhs."KD_JURUSAN"
LEFT JOIN fakultas f ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
where mhs."NIM" = (select max("NIM") from mahasiswa)
GROUP BY j."NM_JURUSAN", f."NM_FAKULTAS"

select * from view_no24
