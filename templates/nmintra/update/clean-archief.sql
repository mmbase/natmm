# Delete all data from archief and object tables, because they are linked
# 1262304000 = 1-1-2010.
DELETE o, a
from v1_object as o
inner join v1_archief AS a ON o.number = a.number
where a.datum < 1262304000;

# Optimize both tables after cleaning
optimize table v1_object;
optimize table v1_archief;
