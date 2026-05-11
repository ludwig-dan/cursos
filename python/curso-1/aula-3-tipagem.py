# tipagem do python - dinâmica / forte
# dinâmica - reconhece o tipo de dado automáticamente
print(123) # <- inteiro
print('123') # <- string
print(1.2) # <- float
print(1 == 1, 1 == 2) # <- boolean

# type é uma classe que retorna o tipo de dado
print(type(123)) # <- inteiro
print(type('123')) # <- string
print(type(1.2)) # <- float
print(type(1 == 1), type(1 == 2)) # <- boolean

#caractér de escape = \
print('Danrlei \'Ludwig\'')

print("Forma mais 'simples'")

#concatenação
print("a" + "b")
#soma
print(1+1)

#print(1+"1") <- erro de casting, tipagem forte do py, não converte automáticamente
# str, int, float e bool não imutáveis
print(str(1)+"1") 
print(1+int("1")) 

print(1.2 + 1) # float prevalece sobre int