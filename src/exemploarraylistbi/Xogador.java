

package exemploarraylistbi;

import java.util.Objects;

public class Xogador {
      private String nome;
      private int dorsal;

    public Xogador() {
    }

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.dorsal;
        return hash;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Xogador other = (Xogador) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        return true;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Xogador other = (Xogador) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Xogador{" + "nome=" + nome + ", dorsal=" + dorsal + '}';
    }
    
      
      
      
}
