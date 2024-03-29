
package br.com.ab.model;

/**
 *
 * @author drink
 */
public class Estado {

    private long id;
    private String nome;
    private String uf;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return String.valueOf(id) + " - "+ this.nome + " - "+ this.uf;
    }


    
    
}
