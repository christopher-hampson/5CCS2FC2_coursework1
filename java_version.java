/**
 * Authors: Emily Tsanova, Christopher Hampson, Remington Anton Amalanathan
 */
import java.io.*;
import java.util.*; 

// Hint: in case you decide to use an additional library, be careful as it may not work

class Pair<T,K> {
    private T first;
    private K second;
    
    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }
    
    public T get_first() {
        return this.first;
    } 
    public K get_second() {
        return this.second;
    } 
    
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
   
    @Override
    public int hashCode() { 
        return this.toString().hashCode(); 
    }
    
    
    @Override
    // Checks specified object is "equal to" current object or not
    public boolean equals(Object other)
    {
        if (this == other)
            return true;
 
        if (other == null || getClass() != other.getClass())
            return false;
 
        Pair<?, ?> pair = (Pair<?, ?>) other;
 
        // call equals() method of the underlying objects
        if (!first.equals(pair.first))
            return false;
        return second.equals(pair.second);
    }
    
    
}

class Graph<T> {
    // The class provides the Graph object
    private ArrayList<T> vertices = new ArrayList<T>();
    private ArrayList<Set<T>> edges = new ArrayList<Set<T>>();
    
    public Graph(){
        ArrayList<T> vertices = new ArrayList<T>();
        ArrayList<Set<T>> edges = new ArrayList<Set<T>>();
        
    }
    
    public void add_vertex(T v) {
        vertices.add(v);
    }
    
    public void add_vertices(T[] V) {
        for(T v : V) {
            add_vertex(v);
        }
    }
    
    public void add_edge(T u, T v) {
        if (has_edge(u,v)==false) {
            Set<T> new_edge = new HashSet<T>();
            new_edge.add(u);
            new_edge.add(v);
            edges.add(new_edge);
        }
    }
    
    public boolean has_edge(T u, T v) {
        Set<T> check_edge = new HashSet<T>();
        check_edge.add(u);
        check_edge.add(v);
        return edges.contains(check_edge);
    }
    
    public ArrayList<T> get_vertices() {
        return vertices;
    }
    
    public ArrayList<Set<T>> get_edges() {
        return edges;
    }
    
}


class Clause {
    // The class provides the Clause object as a wrapper for an ArrayList list of integers literals

    private ArrayList<Integer> literals;

    public Clause(int[] literals) {
        this.literals = new ArrayList<Integer>();
        for(int L : literals) {
            this.literals.add(L);
        }
    }

    public ArrayList<Integer> get_literals(){
        return literals;
    }

    public int getSize(){
        return literals.size();
    }
    
    @Override
    public String toString() { 
        return literals.toString(); 
    } 
}

class Formula {
    // This class provides the Formula object as a wrapper for a list of Clauses

    private ArrayList<Clause> clauses;

    public Formula(ArrayList<Clause> clauses) {
        this.clauses = clauses;
    }

    public ArrayList<Clause> get_clauses(){
        return clauses;
    }

    public void add_clause(int[] literals){
        clauses.add(new Clause(literals));
    }

    public int getSize(){
        return clauses.size();
    }
    
    @Override
    public String toString() { 
        return clauses.toString(); 
    } 

}




/*####################################################
#####################################################*/


public class Coursework1 {
    
    public static ArrayList<ArrayList<Object>> powerset(ArrayList<Object> X) {
        // returns an ArrayList of all subsets of X (as ArrayLists)
        int n = X.size();

        ArrayList<ArrayList<Object>> powerset_list = new ArrayList<ArrayList<Object>>();

        for( long i = 0; i < (1 << n); i++) {
            ArrayList<Object> element = new ArrayList<Object>();
            for( int j = 0; j < n; j++ )
                if( (i >> j) % 2 == 1 ) element.add(X.get(j));
            powerset_list.add(element); 
        }
        
        return powerset_list;
        
    }
    
    public static ArrayList<ArrayList<Object>> subsets(ArrayList<Object> X, int k) {
        // returns an ArrayList of all subsets of X of size k (as ArrayLists)
        ArrayList<ArrayList<Object>> P = powerset(X);
        
        ArrayList<ArrayList<Object>> subset_list = new ArrayList<ArrayList<Object>>();
        
        for (ArrayList<Object> S : P) {
            if(S.size() == k) {
                subset_list.add(S);
            }
        }
        
        return subset_list;
    }

    public static boolean clique_solver(Graph<Object>) {
        // YOUR CODE GOES HERE //

        return // YOUR CODE GOES HERE //
    }

    
    public static Pair<Graph<Object>,Integer> sat_to_clique(Formula F) {
        Graph<Object> G = new Graph<>();
        Integer k = new Integer();

        // YOUR CODE GOES HERE //

        return new Pair<Graph<Object>,Integer>(G, k);
    }
    
    public static boolean sat_solver(Graph<Object>) {
        // YOUR CODE GOES HERE //

        return // YOUR CODE GOES HERE //
    }
    

 

    public static void main(String[] args) {
        // This will be populated to run tests on your code
    }   
    
}



