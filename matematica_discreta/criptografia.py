alfabeto = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7", "8","9"," "]
testes= []
palavras = []
n=len(alfabeto)
msg_criptografada = "10JKHC10450C4S050CK9JE02E1"
msg_criptografada_list= list(msg_criptografada)

for chave in range(n):
    palavras = []    

    for letra in msg_criptografada_list:
        if letra in alfabeto:
            lg = alfabeto.index(letra)
            lk = alfabeto[(lg - chave) % n]
            palavras.append(lk)
    
    palavra_final = "".join(palavras)
    testes.append(f"Chave {chave:02d}: {palavra_final}")

for resultado_teste in testes:
    print(resultado_teste)

# resultado = "A TURMA DE MD2 E MUITO BOA" 
# chave = 27 