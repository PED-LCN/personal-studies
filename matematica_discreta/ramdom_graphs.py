import numpy as np
import networkx as nx
import matplotlib.pyplot as plt



N = int(input("Informe o numero de vertices:"))

p = np.log(N)/N

Arestas= []

for i in range (1,N+1):
  for j in range (1,N+1):
    if j > i:
      t = np.random.rand()
      if t > 1-p:
        Arestas.append((i,j))

G = nx.Graph()
G.add_nodes_from(range(1, N+1))
G.add_edges_from(Arestas)
pos = nx.spring_layout(G)

plt.figure(figsize=(8,8))

if nx.is_connected(G):
    titulo = plt.title(f'Grafo Aleatório com {N} Vértices com diametro {nx.diameter(G)}')
else:
    titulo = plt.title(f'Grafo Aleatório com {N} Vértices \n (Não Conexo) diametro infinito')

nx.draw(G,pos=pos, with_labels=True, node_color='lightblue', edge_color='gray', node_size=500, font_size=16)

plt.show()
  
    
