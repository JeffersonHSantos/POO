# Sistema de Gerenciamento de Produtos - TDE Semana 20/11/2025

## Descrição do Projeto
Este é um projeto Java Desktop desenvolvido usando **javax.swing** para criar uma interface gráfica que permite realizar operações CRUD (Create, Read, Update, Delete) em objetos armazenados em memória.

## Estrutura do Projeto

### Pacotes
- **br.upf.ads.tde.dominio**: Contém as classes de domínio (modelo)
- **br.upf.ads.tde.front**: Contém as interfaces gráficas (frontend)

### Classes Implementadas

#### 1. Produto (Domínio)
Classe de domínio localizada em: `src/br/upf/ads/tde/dominio/Produto.java`

**Atributos (4 atributos conforme solicitado):**
- `codigo` (Integer): Identificador único do produto
- `nome` (String): Nome do produto
- `categoria` (String): Categoria do produto
- `preco` (Double): Preço do produto

**Características implementadas:**
- ✅ Métodos construtores (padrão e parametrizado)
- ✅ Encapsulamento completo (getters e setters)
- ✅ Validação de dados nos setters
- ✅ Substituição dos métodos `equals()` e `hashCode()` para identidade única por código
- ✅ Substituição do método `toString()` para representação textual

#### 2. TelaProdutos (Frontend)
Interface gráfica localizada em: `src/br/upf/ads/tde/front/TelaProdutos.java`

**Componentes implementados:**
- ✅ Formulário com 4 campos para entrada de dados (código, nome, categoria, preço)
- ✅ Tabela (JTable) para exibir lista de produtos
- ✅ 4 botões de operação: Inserir, Alterar, Excluir, Listar
- ✅ Lista em memória (ArrayList) para armazenar objetos

**Funcionalidades:**
- **Inserir**: Adiciona novo produto na lista com validação de duplicidade
- **Alterar**: Modifica dados de um produto existente
- **Excluir**: Remove produto da lista com confirmação
- **Listar**: Atualiza a tabela com todos os produtos em memória
- **Seleção na tabela**: Clique na tabela carrega dados no formulário
- **Limpeza automática**: Formulário é limpo após cada operação
- **Validação de dados**: Verifica tipos numéricos e valores válidos

## Como Executar

### Opção 1: Pela Linha de Comando
```bash
# Compilar o projeto
cd AppProdutos
javac -d bin -sourcepath src src/br/upf/ads/tde/front/TelaProdutos.java

# Executar a aplicação
java -cp bin br.upf.ads.tde.front.TelaProdutos
```

### Opção 2: Importar em uma IDE
1. Abra sua IDE Java (NetBeans, Eclipse, IntelliJ IDEA)
2. Importe o projeto como "Projeto Java Existente"
3. Configure o source folder como `src`
4. Execute a classe `TelaProdutos.java`

## Funcionalidades Detalhadas

### 1. Inserir Produto
- Preencha todos os campos do formulário
- Clique em "Inserir"
- O sistema valida se o código já existe
- Produto é adicionado à lista e exibido na tabela
- Formulário é limpo automaticamente

### 2. Alterar Produto
- Selecione um produto na tabela (os dados carregam no formulário)
- Modifique os campos desejados (exceto o código)
- Clique em "Alterar"
- As alterações são salvas e a tabela é atualizada

### 3. Excluir Produto
- Selecione um produto na tabela
- Clique em "Excluir"
- Confirme a exclusão
- Produto é removido da lista e da tabela

### 4. Listar Produtos
- Clique em "Listar" para atualizar a visualização da tabela
- A tabela mostra: Código, Nome, Categoria e Preço formatado

## Validações Implementadas
- Código deve ser numérico e maior que zero
- Preço deve ser numérico e não pode ser negativo
- Não permite inserir produtos com código duplicado
- Campos obrigatórios são validados

## Tecnologias Utilizadas
- **Java SE 21** (ou superior)
- **javax.swing**: Para componentes gráficos
- **ArrayList**: Para armazenamento em memória
- **DefaultTableModel**: Para gerenciamento da tabela

## Padrões Seguidos
- ✅ Nomenclatura de pacotes seguindo convenções Java (br.upf.ads.tde.*)
- ✅ Separação entre camadas (domínio e front)
- ✅ Encapsulamento de dados
- ✅ Código documentado com JavaDoc
- ✅ Tratamento de exceções

## Autor
Desenvolvido para o TDE da Semana 20/11/2025

## Observações
Este projeto demonstra os conceitos de:
- Programação Orientada a Objetos
- Interfaces Gráficas com Swing
- Manipulação de coleções (ArrayList)
- Padrão MVC simplificado
- CRUD em memória

O projeto está pronto para ser expandido com:
- Persistência em banco de dados
- Exportação/Importação de dados
- Relatórios
- Validações mais complexas
