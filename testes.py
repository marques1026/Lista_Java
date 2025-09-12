import locale
from datetime import datetime

locale.setlocale(locale.LC_ALL, 'pt_BR.UTF-8') #pra formatar o numero em forma de dinheiro brasileiro

cadastro_nome = (str(input("Insira seu nome: ")))
cadastro_sobrenome = (str(input("Insira seu sobrenome: ")))

while True:
    cadastro_data_nasc_str = input("Insira sua data de nascimento (no formato DDMMAAAA): ")
    try:
        data_nasc = datetime.strptime(cadastro_data_nasc_str, '%d%m%Y')
        break 
    except ValueError:
        print("\nFormato de data inválido! Por favor, digite apenas os números no formato DDMMAAAA.\n")


while True:
    try:
        pretensao_salario = float(input("Qual sua pretenção salarial? R$"))
        break
    except ValueError:
        print("Valor inválido, digite apenas números.")

while True:
    opcao_ensino = input("Digite um número de acordo com a opção do seu grau de ensino: \n 1- Ensino Médio completo \n 2- Ensino técnico ou superior \n")
    if opcao_ensino == '1' or opcao_ensino == '2':
        break
    else:
        print("\nOpção inválida! Por favor, insira apenas 1 ou 2.\n")


cargo_pretendido = input("Insira seu cargo pretendido: ")


while True:
    cnh = (str(input("Você possui CNH tipo B? \n 1- Sim \n 2- Não \n")))
    if cnh == "1" or cnh == "2":
        break
    else:
        print("Insira apenas 1 ou 2.")

print(f"O nome completo do candidato é: {cadastro_nome} {cadastro_sobrenome}.")
print(f"A data de nascimento do candidato é: {data_nasc.strftime('%d/%m/%Y')}")
print(f"A pretenção salarial é: {locale.currency(pretensao_salario, grouping=True)}")


print(f"O cargo pretendido é: {cargo_pretendido}.")

if cnh == '1':
    print("O candidato possui CNH tipo B.")
else:
    print("O candidato não possui CNH")


print("Cadastro efetivado com sucesso. Boa sorte!")