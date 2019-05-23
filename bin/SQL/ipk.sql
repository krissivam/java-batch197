select t1."NIM", sum(cast(t3."SKS" as int)) as "TOTAL_SKS", 
sum(cast(t3."SKS" as int) * cast(t4."BOBOT" as int)) as "TOTAL_NILAI",
sum(cast(t3."SKS" as int) * cast(t4."BOBOT" as int)) / sum(cast(t3."SKS" as int)) as "IPK"
from kelas_detail t1
inner join kelas t2 on t1."KD_KELAS" = t2."KD_KELAS"
inner join matakuliah t3 on t2."KD_MK" = t3."KD_MK"
inner join tabel_bobot_nilai t4 on t1."NILAI" = t4."NILAI"
group by t1."NIM"