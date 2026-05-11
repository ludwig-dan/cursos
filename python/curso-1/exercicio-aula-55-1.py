inp = input('digite um número inteiro: ')
try: 
    isPar  = int(inp) % 2 == 0
    if isPar:
        print(f'o número {inp} é par')
    else:
        print(f'o número {inp} é impar')
except:
    print('o número não é inteiro')