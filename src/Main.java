import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month=0, day;

        Scanner utp = new Scanner(System.in);

        System.out.print("Dogdugunuz Ayi Giriniz");
        try {
            month = utp.nextInt();
        }catch (InputMismatchException e){
            System.out.print("Gecerli Ay Giriniz!!!\n");
            System.exit(0);
        }
        if ((month >=1) && (month <=12)){}
        else {System.out.print("Gecerli Ay Giriniz!!!\n");
        System.exit(0);}

        System.out.print("Dogdugunuz Gunu Giriniz");
        day = utp.nextInt();

        switch (month) {
            case 1:
                if ((day >= 1) && (day <= 31)){
                    if (day > 21){
                        System.out.print("Kova");
                    }
                    else {
                        System.out.print("Oglak");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 2:
                if ((day >=1) && (day<=28)){
                    if (day > 19){
                        System.out.print("Balik");
                    }
                    else {
                        System.out.print("Kova");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 3:
                if ((day >=1) && (day<=31)){
                    if (day > 20){
                        System.out.print("Koc");
                    }
                    else {
                        System.out.print("Balik");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 4:
                if ((day >=1) && (day<=30)){
                    if (day > 20){
                        System.out.print("Boga");
                    }
                    else {
                        System.out.print("Koc");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 5:
                if ((day >=1) && (day<=31)){
                    if (day > 21){
                        System.out.print("Ikizler");
                    }
                    else {
                        System.out.print("Boga");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 6:
                if ((day >=1) && (day<=30)){
                    if (day > 22){
                        System.out.print("Yengec");
                    }
                    else {
                        System.out.print("Ikızler");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 7:
                if ((day >=1) && (day<=31)){
                    if (day > 22){
                        System.out.print("Aslan");
                    }
                    else {
                        System.out.print("Yengec");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 8:
                if ((day >=1) && (day<=31)){
                    if (day > 22){
                        System.out.print("Basak");
                    }
                    else {
                        System.out.print("Aslan");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 9:
                if ((day >=1) && (day<=30)){
                    if (day > 22){
                        System.out.print("Terazi");
                    }
                    else {
                        System.out.print("Basak");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 10:
                if ((day >=1) && (day<=31)){
                    if (day > 22){
                        System.out.print("Akrep");
                    }
                    else {
                        System.out.print("Terazi");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 11:
                if ((day >=1) && (day<=30)){
                    if (day > 21){
                        System.out.print("Yay");
                    }
                    else {
                        System.out.print("Akrep");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            case 12:
                if ((day >=1) && (day<=31)){
                    if (day > 21){
                        System.out.print("Oglak");
                    }
                    else {
                        System.out.print("Yay");
                    }
                }
                else {
                    System.out.print("Gecersiz gun girdiniz!!!");
                }
                break;
            default:
            }
        }
    }
