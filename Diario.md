## Criação da classe Position
Foi feito o encapsulamento com o Private e gerado os Getters and Setters.
Adicionado também o construtor recebendo os argumentos.
E o ToString,que aplica o conceito de que a classe Object é uma super classe de todas as classes.
E também o conceito de sobreposição, que sobrescreve o método ToString da classe Object.

## Inicio da implementação do Board and Piece 
Primeiro foi criado um objeto position como protected, ela não é visível na camada de xadrez. 
Depois foi criado o objeto private board, seu construtor e o get apenas, pois não queremos que o tabuleiro
seja alterado.
O método é protected para proteger que apenas classes e subclasses da camada Board possam acessa-lo. 
Criada a classe Board, com Matriz "Piece[][] pieces", construtor e getter and setter.

