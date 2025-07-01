def soma(a,b):
    return a + b
    
def subtracao(a,b):
    return a - b
    
def multiplicacao(a,b):
    return  a * b
    
def divisao(a,b):
    return a / b

# Calculadora simples, com 4 operações básicas , primeira versão, pretendo adicionar mais opções e melhorar a interface futaramente e adicionar uma GUI
print("----------------------------------")
print("|          CALCULADORA           |")
print("----------------------------------")

confirm = input("Deseja realizar uma operação? (S/N) ").upper()

while confirm == "S":
    func = input("Qual operação deseja realizar? [soma/subtracao/multiplicacao/divisao] ")
    func = func.lower().strip()

    a = int(input("Qual o primeiro valor? "))
    b = int(input("Qual o segundo valor? "))
    if func == "soma":
        resultado = soma(a,b)
        print(resultado)
    elif func == "subtracao":
        resultado = subtracao(a,b)
        print(resultado)
    elif func == "multiplicacao":
        resultado = multiplicacao(a,b)
        print(resultado)
    elif func == "divisao":
        if b != 0:
            resultado = divisao(a,b)
            print(resultado)
        else:
            print("Não é possível realizar divisão por zero")
    else:
        print("Você digitou errada a operação!")
    confirm = input("Deseja realizar outra operação? (S/N) ").upper()
print("FIM PROGRAMA")