CREATE VIEW view_no15 AS
SELECT d."NM_DOSEN", mk."NM_MK",  j."NM_JURUSAN", f."NM_FAKULTAS"
FROM dosen d
INNER JOIN kelas k 
ON d."KD_DOSEN" = k."KD_DOSEN"
INNER JOIN matakuliah mk
ON k."KD_MK" = mk."KD_MK"
INNER JOIN jurusan j
ON mk."KD_JURUSAN" = j."KD_JURUSAN"
INNER JOIN fakultas f
ON j."KD_FAKULTAS" = f."KD_FAKULTAS"

SELECT * FROM view_no15