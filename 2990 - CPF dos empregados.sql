select e.cpf, e.enome, d.dnome
from empregados e 
inner join departamentos d on d.dnumero = e.dnumero
where e.cpf NOT IN (
  select e.cpf
  from empregados e
  inner join trabalha tra on tra.cpf_emp = e.cpf
  )
order by cpf 