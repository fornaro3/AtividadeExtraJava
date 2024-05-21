public class Obras {

    private String titulo;
    private String artista;
    private String anoCriacao;
    private String tipoObra;
    private String localizacao;
    
    
    public Obras(String titulo, String artista, String anocriacao, String tipoObra, String localizacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoCriacao = anocriacao;
        this.tipoObra = tipoObra;
        this.localizacao = localizacao;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getArtista() {
        return artista;
    }


    public void setArtista(String artista) {
        this.artista = artista;
    }


    public String getAnoCriacao() {
        return anoCriacao;
    }


    public void setAnoCriacao(String anocriacao) {
        this.anoCriacao = anocriacao;
    }


    public String getTipoObra() {
        return tipoObra;
    }


    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }


    public String getLocalizacao() {
        return localizacao;
    }


    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void exibirObras(){
        System.out.println("Título: " + titulo + "Artista: " + artista +
        "Ano de criação: " + anoCriacao + "Tipo da obra:" +
        tipoObra + "Localização: " + localizacao);
    }

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "Título: " + titulo + "Artista: " + artista +
            "Ano de criação: " + anoCriacao + "Tipo da obra:" +
            tipoObra + "Localização: " + localizacao;

}
    
}
