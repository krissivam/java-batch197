CREATE VIEW view_no1 AS 
SELECT f."NM_FAKULTAS", j."NM_JURUSAN"  
FROM fakultas f 
INNER JOIN jurusan j  
ON j."KD_FAKULTAS" = f."KD_FAKULTAS";

SELECT * FROM view_no1