# Variáveis para armazenar o nome do herói e a quantidade de XP
nome = "Gustavo Boaz"
xp = 8500

# Variável para armazenar o nível do herói
nivel = ""

# Estrutura de decisão para determinar o nível do herói com base na XP
if xp < 1000:
    nivel = "Ferro"
elif 1001 <= xp <= 2000:
    nivel = "Bronze"
elif 2001 <= xp <= 5000:
    nivel = "Prata"
elif 5001 <= xp <= 7000:
    nivel = "Ouro"
elif 7001 <= xp <= 8000:
    nivel = "Platina"
elif 8001 <= xp <= 9000:
    nivel = "Ascendente"
elif 9001 <= xp <= 10000:
    nivel = "Imortal"
elif xp >= 10001:
    nivel = "Radiante"
else:
    nivel = "Desconhecido"

# Saída da mensagem com o nome do herói e o nível correspondente
print(f"O Herói de nome {nome} está no nível de {nivel}")
