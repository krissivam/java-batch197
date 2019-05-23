CREATE VIEW view_no7 AS
SELECT mk."NM_MK",  j."NM_JURUSAN", f."NM_FAKULTAS" 
FROM matakuliah mk
INNER JOIN jurusan j  
ON mk."KD_JURUSAN" = j."KD_JURUSAN"
INNER JOIN fakultas f
ON j."KD_FAKULTAS" = f."KD_FAKULTAS";

SELECT * FROM view_no7