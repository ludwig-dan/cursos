hora = input('Digite a hora atual: ')
if hora.isdigit() and int(hora) < 24:
    int_hora = int(hora)
    dia = int_hora >= 0 and int_hora < 12
    tarde = int_hora >= 12 and int_hora < 18
    noite = int_hora >= 18

    if dia:
        print('Bom dia')
    elif tarde:
        print('Boa tarde')
    elif noite:
        print('Boa noite')
else:
    print('entrada inválida')