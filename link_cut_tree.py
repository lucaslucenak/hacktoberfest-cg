inp = input()
inp = list(inp.split())

l = int(inp[0])
r = int(inp[1])
k = int(inp[2])

cont = 0
saida = ''
while True:
    if (k ** cont) > r: break
    if (k ** cont) >= l:
        saida += str(k ** cont) + ' '
    cont += 1

if saida == '':
    print('-1')
else:
    print(saida.strip())
