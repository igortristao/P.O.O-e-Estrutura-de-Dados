pacote  Atividade ;

importar  java . io . PrintStream ;
importar  java . útil . Scanner ;

 classe  pública questão 10 {
    public  static  void  main ( String [] args ) {
        Scanner  enterScanner = new  Scanner ( System . in );

        int  Pecas1 , NumPecas1 , Pecas2 , NumPecas2 ;
        Peças1 = enterScanner . nextInt ();
        Peças2 = enterScanner . nextInt ();
        NumPecas1 = enterScanner . nextInt ();
        NumPecas2 = enterScanner . nextInt ();

        duplo  PrecoPecas1 , PrecoPecas2 ;
        PrecoPecas1 = enterScanner . próximoDouble ();
        PrecoPecas2 = enterScanner . próximoDouble ();

        duplo  VALORAPAGAR ;
        VALORAPAGAR = (( NumPecas1 * PrecoPecas1 ) + ( NumPecas2 * PrecoPecas2 ));

        Sistema . fora . printf ( "VALOR A PAGAR = R$%.2f" , VALORAPAGAR );


    }
}