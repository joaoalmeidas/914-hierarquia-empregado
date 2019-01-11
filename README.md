# 914-hierarquia-empregado
(Hierarquia Employee) Neste capítulo, você estudou uma hierarquia de herança em que a classe BasePlusCommissionEmployee
é herdada da classe CommissionEmployee. Mas nem todos os tipos de empregados são CommissionEmployees. Neste exercício,
você criará uma superclasse Employee mais geral para calcular os atributos e comportamentos na classe CommissionEmployee
que são comuns a todos os Employees. Os atributos e comportamentos comuns a todos os Employees são firstName, lastName,
socialSecurityNumber, getFirstName, getLastName, getSocialSecurityNumber e uma parte do método toString. Crie
uma nova superclasse Employee que contenha esses métodos e variáveis de instância, além de um construtor. Então, reescreva a classe
CommissionEmployee da Seção 9.4.5 como uma subclasse de Employee. A classe CommissionEmployee só deve conter os métodos
e as variáveis de instância que não são declarados na superclasse Employee. O construtor da classe CommissionEmployee deve chamar
o construtor da classe Employee, e o método toString de CommissionEmployee deve invocar o método toString de Employee.
Depois de concluir essas modificações, execute os aplicativos CommissionEmployeeTest e BasePlusCommissionEmployeeTest
com essas novas classes para garantir que os aplicativos continuem a exibir os mesmos resultados para um objeto CommissionEmployee
e um objeto BasePlusCommissionEmployee, respectivamente.
