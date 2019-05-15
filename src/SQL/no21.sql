CREATE VIEW view_no21 AS
SELECT d."NM_DOSEN", mk."NM_MK",  j."NM_JURUSAN", f."NM_FAKULTAS", k."NM_KELAS", tr."NM_RUANG"
FROM dosen d
INNER JOIN kelas k 
ON d."KD_DOSEN" = k."KD_DOSEN"
INNER JOIN matakuliah mk
ON k."KD_MK" = mk."KD_MK"
INNER JOIN jurusan j
ON mk."KD_JURUSAN" = j."KD_JURUSAN"
INNER JOIN fakultas f
ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
INNER JOIN tabel_ruang tr
ON k."KD_RUANG" = tr."KD_RUANG"
where tr."KAPASITAS" = (select max("KAPASITAS") from tabel_ruang)

SELECT * FROM view_no21