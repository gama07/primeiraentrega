Algoritmo AgenciaDeViagens primeira entrega
var
    var clientes: vetor[1..100] de caracter
    var cpfs: vetor[1..100] de caracter
    var destinos: vetor[1..100] de caracter
    var descricoes: vetor[1..100] de caracter
    var precos: vetor[1..100] de real
    var numClientes: inteiro
    var numDestinos: inteiro

 funcao 
    numClientes <- 0
    numDestinos <- 0
     
     inicio:
    Funcao CadastroCliente()
        Escrever "Digite o nome do cliente: "
        Ler clientes[numClientes]
        Escrever "Digite o CPF do cliente: "
        Ler cpfs[numClientes]
        numClientes <- numClientes + 1
        Escrever "Cliente cadastrado com sucesso!"
    
    Funcao CadastroDestino()
        Escrever "Digite o nome do destino: "
        Ler destinos[numDestinos]
        Escrever "Digite o preço da viagem para este destino: "
        Ler precos[numDestinos]
        numDestinos <- numDestinos + 1
        Escrever "Destino cadastrado com sucesso!"
    
    Funcao ConsultaClientes()
        Escrever "---- CLIENTES CADASTRADOS ----"
        Para i <- 0 Ate numClientes-1 faca
            Escrever "Nome: " + clientes[i]
            Escrever "CPF: " + cpfs[i]
            Escrever "-----------------------------"
        Fim Para
    
    Funcao ConsultaDestinos()
        Escrever "---- DESTINOS CADASTRADOS ----"
        Para i <- 0 Ate numDestinos-1 faca
            Escrever "Destino: " + destinos[i]
            Escrever "Descrição: " + descricoes[i]
            Escrever "Preço: " + precos[i]
            Escrever "-----------------------------"
        Fim Para

    Funcao MenuPrincipal()
        Enquanto verdadeiro faca
            Escrever "---------------------------"
            Escrever "MENU PRINCIPAL"
            Escrever "1. Cadastrar Cliente"
            Escrever "2. Cadastrar Destino"
            Escrever "3. Consultar Clientes"
            Escrever "4. Consultar Destinos"
            Escrever "5. Sair"
            Escrever "Escolha uma opção: "
            Ler 

            Escolha
                Caso 1:
                    CadastroCliente()
                Caso 2:
                    CadastroDestino()
                Caso 3:
                    ConsultaClientes()
                Caso 4:
                    ConsultaDestinos()
                Caso 5:
                    Escrever "Encerrando o programa..."
                    Pare
                Default:
                    Escrever "Opção inválida. Tente novamente."
        Fim Enquanto
    Fim Funcao
Fim Algoritmo





