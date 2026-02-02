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
Criada a classe Board, com a estrutura de dados, "Matriz "Piece[][] pieces", construtor e getter and setter.

## Camada de Xadrez e imprimir o tabuleiro 
1 - Criar o método Board.Piece(row, column) and Board.Piece(position)
2 - Implementar o Chess.Color, que é um tipo enumerado, ele pertence a camada chess. 
3 - Criada classe ChessPiece que extends Piece.
Adionado construtor e o Get, sem o Set, pois a cor não deve ser alterada. 
4 - Criada a classe ChessMatch, coração do xadrez. 
Recebeu o construtor com Matriz para liberar o ChessPiece, para o programa conhecer a camada de xadrez apenas
não a de tabuleiro. 
Criado o For para percorer a matriz (Linhas e colunas) e o downcasting para interpretar como peça de xadrez e não uma 
peça comum. Retorna a matriz mat.
5 - Criada a função que imprime as peças da partida.
A classe UI (User Interface), recebe o método printBoard(), dentro do Program.
6 - Criada a classe UI no pacote application
Recebeu um método auxiliar para imprimir uma peça.
Criada lógica para imprimir o tabuleiro.

