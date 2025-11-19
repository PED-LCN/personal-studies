import networkx as nx
import heapq
import matplotlib.pyplot as plt

cidades = [
"RECIFE", "OLINDA", "GOIANA", "CABO", "IPOJUCA", "TAMANDARE", "CARPINA", "VITORIA", "ESCADA", "LIMOEIRO",
"GRAVATA", "PALMARES", "TORITAMA", "CARUARU", "AGRESTINA", "BREJO", "BELO JARDIM", "LAJEDO",
"PESQUEIRA", "GARANHUNS", "ARCOVERDE", "SERTANIA", "SERRA TALHADA", "FLORESTA", "PETROLINA"
]

arestas = [
("PETROLINA", "FLORESTA", 278),("PETROLINA", "SERRA TALHADA", 372),("FLORESTA", "SERRA TALHADA", 96),
("FLORESTA", "ARCOVERDE", 182),("FLORESTA", "GARANHUNS", 323),("SERRA TALHADA", "SERTANIA", 120),
("SERTANIA", "ARCOVERDE", 60),("ARCOVERDE", "GARANHUNS", 90),("ARCOVERDE", "PESQUEIRA", 40),
("SERTANIA", "BREJO", 149),("PESQUEIRA", "BREJO", 70),("PESQUEIRA", "BELO JARDIM", 30),
("BREJO", "BELO JARDIM", 36),("LAJEDO", "BELO JARDIM", 45),("LAJEDO", "GARANHUNS", 37),
("CARUARU", "BELO JARDIM", 50),("LAJEDO", "AGRESTINA", 56),("CARUARU", "AGRESTINA", 20),
("CARUARU", "TORITAMA", 40),("BREJO", "TORITAMA", 56),("TORITAMA", "LIMOEIRO", 86),
("CARUARU", "GRAVATA", 40),("AGRESTINA", "PALMARES", 60),("GRAVATA", "VITORIA", 30),
("VITORIA", "LIMOEIRO", 44),("LIMOEIRO", "CARPINA", 20),("VITORIA", "ESCADA", 35),
("PALMARES", "ESCADA", 62),("PALMARES", "TAMANDARE", 68),("ESCADA", "CABO", 27),
("ESCADA", "IPOJUCA", 30),("VITORIA", "RECIFE", 50),("RECIFE", "CARPINA", 55),
("RECIFE", "CABO", 35),("CABO", "IPOJUCA", 20),("IPOJUCA", "TAMANDARE", 56),
("RECIFE", "OLINDA", 15),("OLINDA", "GOIANA", 57),("CARPINA", "GOIANA", 52)
]

def criar_grafo_dict(arestas):
    grafo = {}
    for c in cidades:
        grafo[c] = {}
        
    for u, v, peso in arestas:
        grafo[u][v] = peso
        grafo[v][u] = peso
    return grafo

def dijkstra(arestas, source):
    
    grafo = criar_grafo_dict(arestas)
    dist = {v: float('inf') for v in cidades}
    prev = {v: None for v in cidades}
    dist[source] = 0
    pq = [(0, source)]
    visitados = set()

    while pq:
        
        d_atual, u = heapq.heappop(pq)
        
        if u in visitados:
            continue
        visitados.add(u)
        
        if u in grafo:
            for v, peso in grafo[u].items():
                alt = dist[u] + peso

                if alt < dist[v]:
                    dist[v] = alt
                    prev[v] = u
                    heapq.heappush(pq, (alt, v))
    
    return dist, prev

def reconstruir_caminho(prev, target):
    
    caminho = []
    atual = target
    
    while atual is not None:
        caminho.insert(0, atual)
        atual = prev[atual]
        
    return caminho

origem = "BELO JARDIM"
destino = "IPOJUCA"

distancias, predecessores = dijkstra(arestas, origem)
caminho_encontrado = reconstruir_caminho(predecessores, destino)
custo_total = distancias[destino]

G = nx.Graph()
for u, v, w in arestas:
    G.add_edge(u, v, weight=w)

plt.figure(figsize=(14, 10))
pos = nx.kamada_kawai_layout(G, weight='weight')

nx.draw_networkx_nodes(G, pos, node_color='lightgray', node_size=500)
nx.draw_networkx_edges(G, pos, edge_color='lightgray')
nx.draw_networkx_labels(G, pos, font_size=8)

edge_labels = nx.get_edge_attributes(G, 'weight')
nx.draw_networkx_edge_labels(G, pos, edge_labels=edge_labels, font_size=7)

if caminho_encontrado and custo_total != float('inf'):
    arestas_caminho = list(zip(caminho_encontrado, caminho_encontrado[1:]))
    nx.draw_networkx_nodes(G, pos, nodelist=caminho_encontrado, node_color='orange', node_size=600)
    nx.draw_networkx_edges(G, pos, edgelist=arestas_caminho, edge_color='red', width=3)
    nx.draw_networkx_nodes(G, pos, nodelist=[origem], node_color='green', node_size=700)
    nx.draw_networkx_nodes(G, pos, nodelist=[destino], node_color='red', node_size=700)

plt.title(f"Rota Otimizada: {origem} -> {destino} ({custo_total}km)")
plt.axis('off')
plt.show()