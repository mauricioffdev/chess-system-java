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

## Peças no tabuleiro 
1 - Criado o método placePiece na classe Board, acessa a posição da peça livremente, dentro do pacote boardgame.   
2 - Criada a classe Rook (Torre) e King (Rei), as peças são adicionadas em um subpacote.   
3 - Na classe ChessMatch, foi criado o método initialSetup(), 
que inicia a partida de xadrez colocando as peças no tabuleiro.

## Criação da de uma exceção personalizada e implementar uma programação defensiva na classe tabuleiro
1 - Criada a classe BoardException no pacote boardgame.   
2 - Adicionado os métodos positionExists e thereIsAPiece na classe board.   
3 - Criada uma proteção no construtor da classe board
if (rows < 1 || columns < 1) //Se a qtd de linhas for menor do que 1 ou colunas menor do que 1,   
lançamos a exceção personalizada
throw new BoardException("Erro cheating board: there musr be at least 1 row and 1 column");  
Ainda sobre programação defensiva, tiramos o método set rows e set columns  
para que n seja alterada a qtd de linhas e colunas.

## Exceção na camada de Xadrez e Position 
Criada a classeChessException e o construtor que passa a msg para a super classe.   
Criada a class ChessPosition com construtores, atributos, métodos e o GETTER.  
Atualizada a classe Chess Match.  
OBS: Deu um erro, perdi um tempo para sacar que no método Piece piece na classe Board eu tinha escrito Rows e Columns  
mas o correto deve ser row e column, no singular. PQP!  

## Melhora no tabuleiro com cores 
Pegamos o código no GIT para mudar as cores da peça e atualização a classe UI. Link da fonte comentado na classe.   
Atualizado também o código da classe ChessMatch, para ajuste de cores no console.  
Na pasta production criada pelo IntelliJ, abri o Git bash para rodar colorido o programa.  
Para rodar usei java application/Program    

## Método removePiece na classe board 
Criado méotod removePiece, lógica:
Se a posição não existe (position), lançamos uma exceção com msg.  
Se piece(position) igual a null, retorna null.  
Criamos uma variável Piece aux recebendo piece(position).  
Inicia com null e retorna a variável aux com a peça retirada. 

## Método readChessPosition para ler uma posição do usuário
Adicionado na classe UI (readChessPosition).    

## Método ChessMove
Retira a peça de uma posição de origem para a poisção de destino. 






