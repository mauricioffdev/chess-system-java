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

## Tratando exceções e limpando a tela   
Criado o método clearScreen() na classe UI, para limpar a tela do console no GitBash.  
Obs: Lembrando que estamos rodando na pasta "bin" com o comando java application.Program  
Tratamos duas exceções em program, dentro do bloco Try, "ChessException e InputMismatchException".  

## Possíveis movimentos de uma peça 
Criado o método abstract, boolean[][] possibleMoves(), matriz boleana.
Criado o método (hook method) que faz um gancho com a subclasse.  
Método concreto retonando um abstrato.  
Criado o método isThereAnyPossibleMove()  
Atualizado provisóriamente classes King, Rook e ChessPiece.  
Atualizada exceção na classe ChessMatch, isThereAnyPossibleMove()  

## Possíveis movimentos da torre  
Implementato o método ChessPiece.IsThereOpponentPiece(position) [protected], para saber se existe uma peça asversária  
em uma dada casa. Protected, pois só tem acesso a classes do mesmo pacote.  
Implementamos os movimentos possíveis da torre na classe Rook.  

## Impressão dos movimentos possíveis  
Atualizada as classes UI e ChessMath.  
Obs: Rodando colorido no console do IntelliJ, movimentos possíveis da peça em azul.  
Adicionei um salto de linha na classe Program, após o Source, e Target, para não ficar colado com o board.   

## Implementar os movimentos do King  
Criado método canMove() que fala que o rei pode se mover para uma determinada posição.  
Implementado os movimentos do rei em possibleMoves()    

## Troca de jogador em cada turno 
Adicionada as propriedades turn, currentPlayer e os métodos get na classe CheesMatch  
Método NextTurn que troca o turno. Usamos operador ternário:  
currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;   
Atualizado validadeSourcePosition com uma nova exceção.  
Criado o método printMatch na classe UI.  

## Manipulação das peças capturadas  
Criado o método que manipula as peças capturadas na classe UI  

## Método que imprime as peças capturadas  
Criado método pra imprimir as peças capturadas na classe UI  
Implementando um controle de peças capturadas na classe ChessMatch  

## Lógica do Check    
Criado o método ChessPosition na classe ChessPiece.  
Método UndoMove na classe ChessMatch.  
Atualizada a classe UI com "Check" no método printMatch()  

## Lógica do Check Mate  
Criada a propriedade checkMate em ChessMatch  
Criado o método getCheckMate  
Implementada a lógiga testCheckMate  
Atualizado performChessMove na classe ChessMatch  
Atualizado printMatch na classe UI e initialSetup
Atualizada classe Program (While e Try)  

## Contagem do movimento das peças  
Na classe CheessPiece, adicionamos a propriedade moveCount  
Os métodos increaseMoveCount e decreaseMoveCount  
Atualizado método makeMove e undoMove na classe ChessMatch    

# Peça peão  
Classe Pawn e a lógica do peão branco e preto.  

## Bispo  
Criada a classe Bishop + a lógica de movimentação dele.  
Basicamente é a mesma da Torre, por isso foi copiado e apenas ajustado o código.  

























