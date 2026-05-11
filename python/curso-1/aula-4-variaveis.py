"""
nome_completo = 'Danrlei Ludwig'
print(nome_completo)

soma = 2+2
print(soma)

idade = 31
maior_de_idade = idade >= 18
print(maior_de_idade)

print('Nome:', nome_completo, 'Idade:', idade, 'Maior de idade:', maior_de_idade)

# python não tem o conceito de constantes
# convenciona-se usar LETRAS_MAIUSCULAS

velocidade = 60
local_carro = 90

RADAR = 60
LOCAL = 100
RANGE = 1

# usar variáveis legíveis e isolar lógicas em variáveis com nomes que deixem
# claro o que elas representam
vel_carro_pass_radar_1 = velocidade > RADAR
carro_passou_radar_1 = local_carro >= (LOCAL - RADAR) and \
    local_carro <= (LOCAL + RADAR)
carro_multado_radar_1 = carro_passou_radar_1 and vel_carro_pass_radar_1

if vel_carro_pass_radar_1:
    print('Velocidade carro passou do radar 1')

if carro_passou_radar_1:
    print('Carro passou radar 1')

if carro_multado_radar_1:
    print('carro multado em radar 1')
    
"""
# id é o endereço da variável na memória
# o python pode colocar o mesmo id para variáveis com o mesmo valor
v1 = 'a'
v2 = 'a'
v3 = 'b'
print(id(v1))
print(id(v2))
print(id(v3))

