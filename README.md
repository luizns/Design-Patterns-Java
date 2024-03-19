# Java - Design Patterns  (Padrões de projetos)

São soluções típicas para problemas comuns em projeto de software. Eles são como plantas de obra pré fabricadas que você
pode customizar para resolver um problema de projeto recorrente em seu código.

## Classificação dos padrões

- Os padrões criacionais fornecem mecanismos de criação de objetos que aumentam a flexibilidade e a reutilização de
  código.
- Os padrões estruturais explicam como montar objetos e classes em estruturas maiores, enquanto ainda mantém as
  estruturas flexíveis e eficientes.
- Os padrões comportamentais cuidam da comunicação eficiente e da assinalação de responsabilidades entre objetos.

<br>

|                                    | Categoria                 | Padrão de Design                                                                                                                                                                  | Descrição |
|------------------------------------|---------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------|
| <td rowspan="4">Criacional</td>	   | 	Builder	                 | 	Separa a construção de um objeto complexo de sua representação, permitindo que o mesmo processo de construção crie diferentes representações.	                                   |
| 	                                  | 	Factory Method	          | 	Define uma interface para criar um objeto, mas deixa que subclasses decidam qual classe instanciar. Permite a uma classe deferir a instanciação para subclasses.	                |
| 		                                 | 	Prototype	               | 	Cria objetos por cópia de um objeto existente, permitindo a adição ou alteração de propriedades durante a cópia, se necessário.	                                                 |
| 		                                 | 	Singleton	               | 	Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.	                                                                                    |
| 	<td rowspan="2">Structural</td>	  | 	Adapter	                 | 	Permite que interfaces incompatíveis colaborem. Envolve uma classe existente com uma nova interface para que ela possa ser usada por um sistema não compatível.	                 |
| 		                                 | 	Proxy	                   | 	Fornece um substituto ou marcador de posição para outro objeto para controlar o acesso a ele.	                                                                                   |
| 	<td rowspan="3">Behavioral </td>	 | 	Chain of Responsibility	 | 	Passa a solicitação ao longo de uma cadeia de handlers. Ao receber a solicitação, cada handler decide processar ou passar ao próximo handler na cadeia.	                         |
| 		                                 | 	Strategy	                | 	Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. A estratégia permite que o algoritmo varie independentemente dos clientes que o utilizam.	 |
| 		                                 | 	Template Method	         | 	Define o esqueleto de um algoritmo na superclasse mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem mudar sua estrutura.	                               |

## Referências

#### Conceitos README
- [Refactoring.Guru](https://refactoring.guru/pt-br/design-patterns/what-is-pattern)

#### Curso Ada Tech
[Design Patterns em Java](https://comunidade.ada.tech/cursos)

