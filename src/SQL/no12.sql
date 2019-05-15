CREATE VIEW view_no12 AS
SELECT mk."NM_MK",  j."NM_JURUSAN", f."NM_FAKULTAS" 
FROM matakuliah mk
INNER JOIN jurusan j  
ON mk."KD_JURUSAN" = j."KD_JURUSAN"
INNER JOIN fakultas f
ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
WHERE mk."NM_MK" LIKE '%is%';

SELECT * FROM view_no12