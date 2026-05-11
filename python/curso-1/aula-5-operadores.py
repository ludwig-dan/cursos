"""
# OPERADORES MATEMÁTICOS

adicao = 10 + 10
print(adicao)

substracao = 10 + 10
print(substracao)

multiplicacao = 10 * 10
print(multiplicacao)

divicao = 10 / 2 # sempre retorna float
print(divicao)

divicao_inteira = 10 // 2.2
print(divicao_inteira)

exponenciacao = 3 ** 3
print(exponenciacao)

resto_divisao = 17 % 8
print(resto_divisao)
# resto da divisao é o que sobra do ultimo divisil
# 17 % 8 -> último divisivel por 8 antes de 17 = 16, sobra 1
# 15 % 8 -> último divisivel por 8 antes de 15 = 8, sobra 7

resto_divisao = 15 % 8
print(resto_divisao)

# precedência de operadores
# (n + n) -> resolve o que está em () primeiro
# ** 
# * / // %
# + - 
precedencia = 1 + 1 ** 5 + 5
print(precedencia)

# STRING

concatenacao = "Danrlei" +' '+ "Ludwig"
print(concatenacao)

repeticao = concatenacao * 3
print(repeticao)

# LÓGICOS
entrada = input('Digite um número... ')
numero = int(entrada)
if numero % 2 == 0:
    print('o número é par')
elif numero % 2 == 1:
    print('o número é impar')
else:
    print('bug na matrix')

'''
Operadores de comparação (relacionais)
OP      Significado         Exemplo (True)
>       maior               2 > 1
>=      maior ou igual      2 >= 2
<       menor               1 < 2
<=      menor ou igual      2 <= 2
==      igual               'a' == 'a'
!=      diferente           'a' != 'b'
'''
maior = 2 > 1
maior_ou_igual = 2 >= 2
menor = 1 < 2
menor_ou_igual = 2 <= 2
igual = 'a' == 'a'
diferente = 'a' != 'b'

# Operadores lógicos
# and (e) or (ou) not (não)
# and - Todas as condições precisam ser
# verdadeiras.
# Se qualquer valor for considerado falso,
# a expressão inteira será avaliada naquele valor
# São considerados falsy (que vc já viu)
# 0 0.0 '' False
# Também existe o tipo None que é
# usado para representar um não valor
entrada = input('[E]ntrar [S]air: ')
senha_digitada = input('Senha: ')

senha_permitida = '123456'

if (entrada == 'E' or entrada == 'e')  and senha_digitada == senha_permitida:
    print('Entrar')
else:
    print('Sair')

# Avaliação de curto circuito
print(True and False and True)
print(True and 0 and True)

senha = input('Senha: ')
if not senha:
    print('Você não digitou nada')        

print(not True)

print('lei' in nome)
print('leia' not in nome)
"""


