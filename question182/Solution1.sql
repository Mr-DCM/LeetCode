SELECT DISTINCT Email FROM Person AS t1 WHERE (SELECT COUNT(1) FROM Person AS t2 WHERE t2.Email = t1.Email) > 1;