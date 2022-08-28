pacote  com . exemplo . atividade9

importar  java . útil . Scanner ;

 questão de classe  pública 9 {

    public  static  void  main ( String [] args ) {
        Scanner  enterScanner = new  Scanner ( System . in );
         Nome da string ;
        duplo  SalarioFixo , TotalVendas ;
        Sistema . fora . print ( "nome:" );

        nome = enterScanner . próximo ();
        SalarioFixo = enterScanner . próximoDouble ();
        TotalVendas = enterScanner . próximoDouble ();
        duplo  TOTAL ;

        TOTAL = ( SalárioFixo + TotalVendas * 0,15 );

        Sistema . fora . printf ( "TOTAL = %.2f" , TOTAL );







    }
}