package br.ucsal.appsemoc;

public class Horario {
    private String local;
    private String data;
    private String programacao;
    private String eixo;

    public Horario(String local, String data, String programacao, String eixo) {
        this.local = local;
        this.data = data;
        this.programacao = programacao;
        this.eixo = eixo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProgramacao() {
        return programacao;
    }

    public void setProgramacao(String programacao) {
        this.programacao = programacao;
    }

    public String getEixo() {
        return eixo;
    }

    public void setEixo(String eixo) {
        this.eixo = eixo;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "local='" + local + '\'' +
                ", data='" + data + '\'' +
                ", programacao='" + programacao + '\'' +
                ", eixo='" + eixo + '\'' +
                '}';
    }
}
