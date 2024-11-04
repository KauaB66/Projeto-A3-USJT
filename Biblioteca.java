public class Biblioteca {

    private String autor;
    private String genero;
    private int anoDeLancamento;
    private String codigoISBN;
    private int quantidadeDeCopias;
    private double valor;
    private String tema;
    private String prateleira;
    private int quantidadeDePaginas;
    private String edicao;

    public Biblioteca(String autor, String genero, int anoDeLancamento, String codigoISBN, int quantidadeDeCopias, double valor, String tema, String prateleira, int quantidadeDePaginas, String edicao) {
        this.autor = autor;
        this.genero = genero;
        this.anoDeLancamento = anoDeLancamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeDeCopias = quantidadeDeCopias;
        this.valor = valor;
        this.tema = tema;
        this.prateleira = prateleira;
        this.quantidadeDePaginas = quantidadeDePaginas;
        this.edicao = edicao;
    }

 
    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public int getQuantidadeDeCopias() {
        return quantidadeDeCopias;
    }

    public double getValor() {
        return valor;
    }

    public String getTema() {
        return tema;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public String getEdicao() {
        return edicao;
    }
    /*setter */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAnodeLançamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setCodigoISBN(String codigoISBN){
        this.codigoISBN = codigoISBN;
    }

    public void setQuantidadeDeCopias(int quantidadeDeCopias){
        this.quantidadeDeCopias = quantidadeDeCopias;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    public void setPrateleira (String prateleira){
        this.prateleira = prateleira;
    }

    public void setQuantidadeDepaginas(int quantidadeDePaginas){
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public void setEdicao(String edicao){
        this.edicao = edicao;
    }

    void setAnoDeLancamento(int novoAnoDeLancamento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void setQuantidadeDePaginas(int novaQuantidadeDePaginas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    

}
