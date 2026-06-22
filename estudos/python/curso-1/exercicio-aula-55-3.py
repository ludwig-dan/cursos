primeiro_nome = input('Digite seu primeiro nome: ')
tamanho_nome = len(primeiro_nome)
if tamanho_nome <= 4:
    print('seu nome é curto')
elif tamanho_nome <= 6:
    print('seu nome é normal')
else:
    print('seu nome é grande')