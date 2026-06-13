package br.gov.sp.fatec.pg.oo;

public class Main {
    public static void main(String[] args) {
        
        Data data = new Data();
        data.setDia( 10 );
        data.setMes( 03 );
        data.setAno( 2026 );
        
        Data nascimento = new Data();
        nascimento.setDia( 10 );
        nascimento.setMes( 10 );
        nascimento.setAno(2004);

        data.ExibirData();
        System.out.print("DATA DE NASCIMENTO \n"); nascimento.getData();

        Horario hora = new Horario();
        hora.setHoras(2 );
        hora.setMinutos( 30 );
        hora.setSegundos( 47 );
        System.out.print("HORÁRIO: \n"); hora.getHorario();

        Horario intervalo = new Horario();
        intervalo.setHoras(4);
        intervalo.setMinutos(50);
        intervalo.setSegundos(21);
        System.out.print("INTERVALO: \n"); intervalo.getHorario();
    }
}
