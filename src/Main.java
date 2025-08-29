public class Main{
    public static void main(String args[]){

        Empresario empresario = new Empresario("Manoel Gomes",40028922);

        Membro memb1 = new Membro("Vinicius de Moraes", "Cantor");

        Membro memb2 = new Membro("Dj Azeitona","Samplista");

        Membro memb3 = new Membro("Xin Jinping","Baterista social");

        Musica m1 = new Musica("Tarde em Itapoã", 4.03f);

        Musica m2 = new Musica("I write sins not tragedies", 3.06f);

        Musica m3 = new Musica("Remember the Time", 3.59f);

        Banda banda = new Banda("A Química do Mal","Beatbox");
        banda.setEmpresario(empresario);
        banda.addMembro(memb1);
        banda.addMembro(memb2);
        banda.addMembro(memb3);
        banda.addMusica(m1);
        banda.addMusica(m2);
        banda.addMusica(m3);
        banda.mostraInfo();
    }
}
