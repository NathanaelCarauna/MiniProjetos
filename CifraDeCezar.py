alfabeto = ['a', 'b', 'c', 'd', 'e', 'f', 'g',
'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

print("Bem vindo ao DecodeEncode Cézar\r\n")
while True:
  print("Escolha uma opção: ")
  print('"C" para codificar')
  print('"D" para decodificar')
  print('"Q" para sair\r\n')

  escolha = input("Opção desejada: ").lower()

  if escolha == 'q':
    print('DecodeEncode Cézar finalizado')
    break

  if escolha == 'c' or escolha == 'd':
    
    shift = int(input('Qual o valor do salto? '))
    mensagemOutput = ''

    if escolha == 'c':
      mensagemInput = input('Digite a mensagem a ser codificada: ').lower()

      for i in range(len(mensagemInput)):
        if mensagemInput[i] not in alfabeto:
          mensagemOutput += mensagemInput[i]
        else:  
          letra = str(mensagemInput[i])
          index = alfabeto.index(letra)
          index += shift

          if index >= len(alfabeto):
            index = index-len(alfabeto)

          mensagemOutput += alfabeto[index]
      print(mensagemOutput + '\r\n')

    else:
      mensagemInput = input('Digite a mensagem a ser decodificada: ')

      for i in range(len(mensagemInput)):
        if mensagemInput[i] not in alfabeto:
          mensagemOutput += mensagemInput[i]
        else:
          letra = str(mensagemInput[i])
          index = alfabeto.index(letra)
          index -= shift

          if index < 0:
            index = len(alfabeto) + index

          mensagemOutput += alfabeto[index]
      print(mensagemOutput + '\r\n')

  else:
    print('Opção inválida')
