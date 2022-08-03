public class Main {

    public static void main(String [] args){

        int numeroIf = 2;
        if(numeroIf<0) System.out.println("numeroIf es negativo");
        else if (numeroIf>0) System.out.println("El numeroIf es positivo");
        else System.out.println("El numeroIf es cero");

        int numeroWhile = -5;

        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("numeroWhile es: "+ numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println("El numeroWhile es: " + numeroWhile);
        }while (numeroWhile<-5);

        for (int numeroFor = 0;numeroFor<=3;numeroFor++){
            System.out.println("El numeroFor es: " + numeroFor);
        }

        String estacion = "Verano";
        switch (estacion){
            case "Verano":
                System.out.println("La estación es verano");
                break;
            case "Invierno":
                System.out.println("La estación es invierno");
                break;
            case "Primavera":
                System.out.println("La estación es primavera");
                break;
            case "Otoño":
                System.out.println("La estación es otoño");
                break;
            default:
                System.out.println("El valor de la variable no es una estación");
        }

    }
}
