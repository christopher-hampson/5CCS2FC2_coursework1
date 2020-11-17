import networkx as nx
import itertools

class Graph:
    ## The class provides the Graph object as wrapper for a networkx undirected Graph
    def __init__(self):
        self.G = nx.Graph()

    def __name__(self):
        return "Graph"

    def __eq__(self,other):
        return nx.is_isomorphic(self.G, other.G)
        
    def __repr__(self):
        return "{0}\n{1}".format(self.get_vertices(),self.get_edges())
        
    def add_vertex(self,v):
        self.G.add_node(v)

    def add_vertices(self,V):
        for v in V:
            self.add_vertex(v)

    def has_edge(self,u,v):
        return self.G.has_edge(u,v)
        
    def get_vertices(self):
        return list(self.G.nodes())
        
    def add_edge(self,u,v):
        self.G.add_edge(u,v)
        
    def get_edges(self):
        return list(self.G.edges())
   

class Clause:
    ## The class provides the Clause object as a wrapper for a list of integers literals
    def __init__(self,literals):
        self.literals = literals
               
    def get_literals(self):
        return list(self.literals)

class Formula:
    ## This class provides the Formula object as a wrapper for a list of Clauses
    def __init__(self,clauses):
        self.clauses = [Clause(C) for C in clauses]

    def __repr__(self):
        return " & ".join(["({0})".format("|".join([str(L) for L in C.get_literals()])) for C in self.clauses])
        
    def get_clauses(self):
        return list(self.clauses)
        
    def __len__(self):
        return len(self.clauses)

    def add_clause(self,literals):
        self.clauses.append(Clause(literals))

   
def powerset(X):
    ## returns a list of all subsets of X (as tuples)
    return [S for k in range(len(X)+1) for S in subsets(X,k)]

def subsets(X,k):
    ## returns a list of all subsets of X of size k (as tuples)
    return list(itertools.combinations(X,k))    
    
    

#########################################################
#########################################################



def clique_solver(G,k):

    ## YOUR CODES GOES HERE ##

    return ## YOUR CODES GOES HERE ##


def sat_to_clique(F):
    G = Graph()

    ## YOUR CODES GOES HERE ##

    return (G,k)

def sat_solver(F):
##   YOUR CODES GOES HERE ##

    return ## YOUR CODES GOES HERE ##


