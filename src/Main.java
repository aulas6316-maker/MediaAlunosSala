import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    float numNota1, numNota2, media;

    System.out.println("Digite a nota da primeira prova:");
     numNota1 = sc.nextFloat();

    System.out.println("Digite a nota da segunda prova:");
        numNota2 = sc.nextFloat();

    media = (numNota1 + numNota2)/2;

    System.out.println("Media: " + media);

    if (media < 4.0) {
        System.out.println("Aluno reprovado");
    } else if (media >= 7.0) {
        System.out.println("Aluno aprovado");
    } else {
        System.out.println("Aluno de recuperação");
    }

    sc.close();
}
