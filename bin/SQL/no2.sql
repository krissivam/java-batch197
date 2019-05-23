CREATE VIEW view_no2 AS
SELECT f."NM_FAKULTAS", j."NM_JURUSAN"  
FROM fakultas f 
INNER JOIN jurusan j  
ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
WHERE f."NM_FAKULTAS" LIKE '%fi%';

SELECT * FROM view_no2