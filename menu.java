import java.util.ArrayList;
import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        boolean menuLoop = true;
        ArrayList<Biblioteca> clientes = new ArrayList<>();
        String opcao;

         /*painel */
        do {
            opcao = JOptionPane.showInputDialog(null,
                    "Escolha uma opção:\n1. Incluir Cliente\n2. Alterar Cliente\n3. Excluir Cliente\n4. Consultar Cliente\n5. Sair",
                    "Cadastro de Clientes", JOptionPane.QUESTION_MESSAGE);
            switch (opcao) {
                case "1" -> {
                    String autor = JOptionPane.showInputDialog("Digite o autor:");
                    String genero = JOptionPane.showInputDialog("Digite o gênero:");
                    int anoDeLancamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento:"));
                    String codigoISBN = JOptionPane.showInputDialog("Digite o código ISBN:");
                    int quantidadeDeCopias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cópias:"));
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do livro:"));
                    String tema = JOptionPane.showInputDialog("Digite o tema:");
                    String prateleira = JOptionPane.showInputDialog("Digite a prateleira:");
                    int quantidadeDePaginas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de páginas:"));
                    String edicao = JOptionPane.showInputDialog("Digite a edição:");

                    Biblioteca cliente = new Biblioteca(autor, genero, anoDeLancamento, codigoISBN, quantidadeDeCopias, valor, tema, prateleira, quantidadeDePaginas, edicao);
                    clientes.add(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
                }
                
                /* alteração do cliente */
                case "2" -> {
                String codigoAlteracao = JOptionPane.showInputDialog("Digite o código ISBN do cliente a ser alterado:");
                    Biblioteca clienteParaAlterar = null;

                    for (Biblioteca c : clientes) {
                        if (c.getCodigoISBN().equals(codigoAlteracao)) {
                            clienteParaAlterar = c;
                            break;
                        }
                    }

                    if (clienteParaAlterar != null) {

                     String novoAutor = JOptionPane.showInputDialog("Digite o novo autor (Atual: " + clienteParaAlterar.getAutor() + "):");
                     String novoGenero = JOptionPane.showInputDialog("Digite o novo gênero (Atual: " + clienteParaAlterar.getGenero() + "):");
                     int novoAnoDeLancamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo ano de lançamento (Atual: " + clienteParaAlterar.getAnoDeLancamento() + "):"));
                     int novaQuantidadeDeCopias = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de cópias (Atual: " + clienteParaAlterar.getQuantidadeDeCopias() + "):"));
                     double novoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor do livro (Atual: " + clienteParaAlterar.getValor() + "):"));
                     String novoTema = JOptionPane.showInputDialog("Digite o novo tema (Atual: " + clienteParaAlterar.getTema() + "):");
                     String novaPrateleira = JOptionPane.showInputDialog("Digite a nova prateleira (Atual: " + clienteParaAlterar.getPrateleira() + "):");
                     int novaQuantidadeDePaginas = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de páginas (Atual: " + clienteParaAlterar.getQuantidadeDePaginas() + "):"));
                     String novaEdicao = JOptionPane.showInputDialog("Digite a nova edição (Atual: " + clienteParaAlterar.getEdicao() + "):");

                     clienteParaAlterar.setAutor(novoAutor);
                        clienteParaAlterar.setGenero(novoGenero);
                        clienteParaAlterar.setAnoDeLancamento(novoAnoDeLancamento);
                        clienteParaAlterar.setQuantidadeDeCopias(novaQuantidadeDeCopias);
                        clienteParaAlterar.setValor(novoValor);
                        clienteParaAlterar.setTema(novoTema);
                        clienteParaAlterar.setPrateleira(novaPrateleira);
                        clienteParaAlterar.setQuantidadeDePaginas(novaQuantidadeDePaginas);
                        clienteParaAlterar.setEdicao(novaEdicao);

                        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;
                }
                  
                /*cliente a ser excluido */
                case "3" -> {
                    String codigoParaExcluir = JOptionPane.showInputDialog("Digite o código ISBN do cliente a ser excluído:");
                    boolean clienteEncontrado = false;

                    for (Biblioteca c : clientes) {
                        if (c.getCodigoISBN().equals(codigoParaExcluir)) {
                            clientes.remove(c); 
                            clienteEncontrado = true;
                            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                            break;
                        }
                    }

                    if (!clienteEncontrado) {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;

                }

                /*consultar clientes */
                case "4" -> {
                    String consultarCliente = JOptionPane.showInputDialog("Digite o código ISBN do cliente!");
                    @SuppressWarnings("unused")
                    boolean clienteEncontrado = false;

                    for(Biblioteca c: clientes){
                        if (c.getCodigoISBN().equals(consultarCliente)){
                            clienteEncontrado = true;
                            String info = "autor:" + c.getAutor() +
                            "/nGenero:" + c.getGenero() +
                            "/nAno de lançamento:" + c.getAnoDeLancamento() +
                            "\nCódigo ISBN: " + c.getCodigoISBN() +
                            "\nQuantidade de Cópias: " + c.getQuantidadeDeCopias() +
                            "\nValor: " + c.getValor() +
                            "\nTema: " + c.getTema() +
                            "\nPrateleira: " + c.getPrateleira() +
                            "\nQuantidade de Páginas: " + c.getQuantidadeDePaginas() +
                            "\nEdição: " + c.getEdicao();
                            JOptionPane.showMessageDialog(null, info);
                            break;
                        }
                    }
                }

                /*Sair */
                case "5" -> {
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    menuLoop = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Escolha um número válido!");
            }
        } while (!opcao.equals("5"));
    }
}
