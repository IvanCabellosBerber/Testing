public class PRU03EX01_Ivan_Cabellos {

    public static void main(String[] args) throws Exception {

        AlumneReal alumne1 = new AlumneReal("Biel");
        AlumneReal alumne2 = new AlumneReal("Tofol");

        alumne1.inicialitzar_Modul_Matricula(2, new String[]{"Programacio", "Entorns de desenvolupament"});
        alumne1.matricularModul("Programacio");
        alumne1.comprovarMatriculat("Programacio");

        alumne2.inicialitzar_Modul_Matricula(2, new String[]{"Programacio", "Entorns de desenvolupament"});
        alumne2.matricularModul("Entorns de desenvolupament");
        alumne2.comprovarMatriculat("Entorns de desenvolupament");

        System.out.println("L'alumne " + alumne1.nom + " ha tret un: " + alumne1.ferExamen("Programacio"));
        System.out.println("L'alumne " + alumne2.nom + " ha tret un: " + alumne2.ferExamen("Entorns de desenvolupament"));

    }

}
