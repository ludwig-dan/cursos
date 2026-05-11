"""
# f-strings
# f no início de uma string permite usar variaveis entre {} no meio dela
#:.2f -> duas casa decimais
nome = 'Danrlei'
altura = 1.7929
linha_um = f'{nome} tem {altura:.2f}m'

print(linha_um)

# função format
string = '{} tem {:.2f}m' # por ordem
print(string.format(nome, altura))

string_index = '{1} tem {0:.2f}m' # por index
print(string_index.format(altura, nome))

string_name = '{nome} tem {altura:.2f}m'# por nome
print(string_name.format(nome=nome, altura=altura))

string_name = '{0} tem {altura:.2f}m'# o que vem antes de um nomeado pode ser por index mas oque vem depois precisa estar nomeado também
print(string_name.format(nome, altura=altura))

nome = 'Luiz'
preco = 100.45645646
variavel = '%s, o preço é R$%.2f' % (nome, preco)
print(variavel)


# interpolação básica de string
# s - string
# f - float
# d e i - int
# x e X - Hexadecimal
variavel = 'ABC'
print(f'{variavel:_>10}') # preenche a esquerda até chegar em 10 caractéres
print(f'{variavel:_<10}') # preenche a direita até chegar em 10 caractéres
print(f'{variavel:_^10}') # preenche ao redor até chegar em 10 caractéres

print(f'{1000.4546546546:,.1f}')
# Strings são iteráveis
#  0 1 2 3 4 5...

nome = 'Danrlei'
print(nome[2])

# primeiro parametro => inicio
# segundo parametro => fim
print(nome[0:4]) # o índice final(índice 4) não é incluído

# índice negativo
# -1 -> último caractér 
print(nome[-1])

print(f'o tamanho da string é {len(nome)}') # tamanho da string

# o terceiro parametro é o "passo" da string, padrão 1

print(nome[0:len(nome):2]) # exibe a cada 2



nome = input('Digite seu nome: ')
idade = input('Digite sua idade: ')
if nome and idade:
    print(f'seu nome é {nome}')
    print(f'seu nome invertido é {nome[-1:-len(nome)-1:-1]}') # PODE SER SIMPLESMENTE nome[::-1]
    if ' ' in nome:
        print('seu nome contém espaços')
    else: 
        print('seu nome não contém espaços')
    print(f'seu nome tem {len(nome)} letras')
    print(f'a primeira letra do seu nome é {nome[0]}')
    print(f'a última letra do seu nome é {nome[-1]}')
else:
    print('um dos campos não foi informado')
"""