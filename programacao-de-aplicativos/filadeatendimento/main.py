# Kauê Fraga Rodrigues 2-54

import os
import lib

atendimentos = []

contador_atendimentos = 0
while True:
    os.system('cls')
    lib.mostra_menu()

    escolha = int(input('Escolha uma opção: '))

    if escolha == 1:
        print(f'Atendimento #{len(atendimentos) + 1}')

        if contador_atendimentos == 10:
            print('Atendimento Finalizado')
            continue

        nome = input('Informe o nome do cliente: ')
        atendimentos.append(nome)
        contador_atendimentos += 1
    elif escolha == 2:
        if len(atendimentos) == 0:
            print('Não tem atendimentos')
            continue

        print('Atendimentos:')
        print()
        for i in range(len(atendimentos)):
            print(f'- #{i + 1} {atendimentos[i]}')
    elif escolha == 3:
        if len(atendimentos) == 0:
            print('Não tem atendimentos')
            continue

        a = atendimentos.pop(0)
        print(f'Próximo da fila: {a}')
    elif escolha == 4:
        atendimentos_disponiveis = 10 - len(atendimentos)

        print(f'Quantidade de atendimentos disponíveis: {atendimentos_disponiveis}')
    else:
        break

    os.system('pause')

print('Fila de atendimento finalizada!')