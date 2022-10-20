package br.ucsal.projetosemoc;

public class Evento {
    private String tema;
    private String programacao;
    private String horario;
    private String local;

    public Evento(String tema, String programacao, String horario, String local) {
        this.tema = tema;
        this.programacao = programacao;
        this.horario = horario;
        this.local = local;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getProgramacao() {
        return programacao;
    }

    public void setProgramacao(String programacao) {
        this.programacao = programacao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titulo='" + tema + '\'' +
                ", descricao='" + programacao + '\'' +
                ", horario='" + horario + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
