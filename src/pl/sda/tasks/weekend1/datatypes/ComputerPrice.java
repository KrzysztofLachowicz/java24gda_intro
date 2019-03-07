package pl.sda.tasks.weekend1.datatypes;

/*
    W osobnej klasie ComputerPrice, w metodzie main() napisz program obliczający cenę komputera na podstawie jego części.
    Program ma wypisać na konsolę osobno cenę samego komputera: płyta główna, procesor, pamięć RAM, dysk twardy i
    osobno cenę komputera i monitora. W cenie należy uwzględnić podatek VAT = 23%.
 */
public class ComputerPrice {
    public static void main(String[] args) {
        double mainBoardPrice = 530.5;
        double processorPrice = 405;
        double ramPrice = 122;
        double hardDrivePrice = 145;
        double monitorPrice = 811;

        final double VAT = 1.23;

        double computerPrice = mainBoardPrice + processorPrice + ramPrice + hardDrivePrice;
        System.out.println("Computer price = " + computerPrice);
        System.out.println("Computer price + VAT = " + computerPrice * VAT);

        double monitorAndComputerPrice = computerPrice + monitorPrice;
        System.out.println("Computer and monitor price = " + monitorAndComputerPrice);
        System.out.println("Computer and monitor price + VAT = " + monitorAndComputerPrice * VAT);
    }
}