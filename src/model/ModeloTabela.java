package model;
//  importar uma biblioteca para armazenamento.

import java.util.ArrayList;
// importando classe de tabela abstrato
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{
	// criar uma variavel statica e passa as colunas que foram criadas das tabelas.
	
	private static final String[]colunas={        // criando um variavel vetor para armazenar os dados
		"Id", "Cpf/cnpj", "Nome", "E-mail", "Telefone", "Endereco"
};
	// criar uma array de clientes 
	private ArrayList<Cliente> clientes;
		
	@Override
	public int getRowCount() {
		// acessando o tamanho da classe
		return clientes.size();
	}

	@Override
	public int getColumnCount() {
		// pegando a variavel coluna e o comprimento dela
		return colunas.length;
	}
	
   // cria um metodo construtor da classe
	public ModeloTabela(ArrayList<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// metodo para pegar o valor de cada celula
		Cliente cliente = clientes.get(columnIndex);
		if (columnIndex ==0) {
			return cliente.getId();
		}else
			if (columnIndex ==1) {// referencia as colunas 
				return cliente.getCpf();
			}else
				if (columnIndex ==0) {// referencia as colunas 
					return cliente.getNome();
				}else
					if (columnIndex ==0) {// referencia as colunas 
						return cliente.getEmail();
					}else
						if (columnIndex ==0) {// referencia as colunas 
							return cliente.getTelefone();
						}else
							if (columnIndex ==0) {// referencia as colunas 
								return cliente.getEndereco();
							}else {
								
		return null;
	}

}
	// metodo para definir o nome da coluna getcolunname
@Override
public String getColumnName(int column) {
	// TODO Auto-generated method stub
	return colunas[column];
}

	
	
}
