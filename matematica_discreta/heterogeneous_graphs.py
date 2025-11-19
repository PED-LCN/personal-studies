import numpy as np
import networkx as nx
import matplotlib.pyplot as plt

N = int(input("Informe o numero de vertices:"))

Arestas= []
L = []

L.append(1)
L.append(2)
Arestas.append((1,2))


for i in range (3,N+1):
  u = np.random.choice(L)
  Arestas.append((i,u)) 
  L.append(u)
  L.append(i)
  

G = nx.Graph()
G.add_edges_from(Arestas)
pos = nx.kamada_kawai_layout(G)

plt.figure(figsize=(10,8))


titulo = plt.title(f'Grafo Heterogêneo com {N} Vértices com diametro {nx.diameter(G)}')
tamanhos = [G.degree(n) * 100 for n in G.nodes()]

nx.draw(G,pos=pos, with_labels=True, node_color='lightblue', edge_color='gray', node_size=tamanhos, font_size=16)
plt.show()
  
    
