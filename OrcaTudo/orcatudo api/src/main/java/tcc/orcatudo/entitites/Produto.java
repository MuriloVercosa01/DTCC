package tcc.orcatudo.entitites;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "produto")
public class Produto {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( nullable = false)
    private String nome;

    @Column( nullable =  false)
    private String descricao;

    @Column( nullable =  false)
    private Double preco;

    @Lob
    private Byte[] imagem;

    @ManyToOne
    @JoinColumn( name = "id_subcategoriafinal" )
    private SubcategoriaFinal subcategoriaFinal;


    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Byte[] getImagem() {
        return imagem;
    }

    public void setImagem(Byte[] imagem) {
        this.imagem = imagem;
    }

    public SubcategoriaFinal getSubcategoriaFinal() {
        return subcategoriaFinal;
    }

    public void setSubcategoriaFinal(SubcategoriaFinal subcategoriaFinal) {
        this.subcategoriaFinal = subcategoriaFinal;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
}
