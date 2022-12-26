package  br.com.banco.Modelo.TransacaoModelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name =" transferencia")
@Getter
@Setter
public class TransacaoModelo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long id;
    private double valor;
    private String tipo;
    private String nome_operador_transacao;
    private long conta_id;
    
}