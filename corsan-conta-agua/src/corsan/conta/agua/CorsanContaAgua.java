///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package corsan.conta.agua;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.Scanner;
//
///**
// *
// * @author danie
// */
//public class CorsanContaAgua {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
////      taxa base R$ 26,60
////      valor metro cubico exedente  R$5,61
////      metros cubicos inclusos na taxa 20m3 dividido por 6 = 3,33m³
////      corsam.com.br
//
//        float taxaReais=26.60f;
//        BigDecimal taxaReaisAredondada = new BigDecimal(taxaReais).setScale(2, RoundingMode.HALF_EVEN);
//
//        float aguaDentroDaTaxa=(20f/6f)*1000f;
//        BigDecimal aguaDentroDaTaxaAredondada = new BigDecimal(aguaDentroDaTaxa).setScale(0, RoundingMode.HALF_EVEN);
//
//        float valorLitroExedente=(5.61f/1000f);
//        BigDecimal valorLitroExedenteAredondada = new BigDecimal(valorLitroExedente).setScale(5, RoundingMode.HALF_EVEN);
//
//        System.out.println("Sistema de Cálculo do valor de água a ser pago!\n\n");
//        System.out.println("O valor da Taxa de água é de: R$" + taxaReaisAredondada);
//        System.out.println("\n A quantidade de litros inclusa nesta taxa é de: " + aguaDentroDaTaxaAredondada);
//        System.out.println("\n O valor do litro de água exedente da taxa é de: R$" + valorLitroExedenteAredondada);
//
//
//        Scanner ler = new Scanner(System.in);
//        System.out.println("\n informe o numero da leitura atual:\n");
//        int atual=ler.nextInt();
//        System.out.println("\n Você digitou na leitura atual: " + atual);
//        
//        System.out.println("\n informe o numero da leitura anterior:\n");
//        int anterior=ler.nextInt();
//        System.out.println("\n Você digitou na leitura anterior: " + anterior);
//
//        int litros=atual-anterior;
//        
//        System.out.println("\n Você gastou: "+litros + " litros de água este mês.\n");
////        System.out.println("----------------");
//        
//        if(litros<=aguaDentroDaTaxa){
//            System.out.println("\n Você não gastou mais que a taxa esse mês e, portanto, você só precisa pagar"
//                    + " o valor da taxa que é de: \n\n R$"+taxaReaisAredondada);
//        }else{
//            float aguaExedente=litros-aguaDentroDaTaxa;
//            float valorAgua=taxaReais+(aguaExedente*valorLitroExedente);
//            BigDecimal valorAguaAredondada = new BigDecimal(valorAgua).setScale(2, RoundingMode.HALF_EVEN);
//
//           System.out.println("\n Você gastou mais que a taxa esse mês e, portanto,"
//                    + "o valor a pagar esse mês é de: \n\n R$"+valorAguaAredondada);
//        }
//    }
//    
//}
