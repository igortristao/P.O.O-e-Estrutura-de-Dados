pacote  Atividade ;

importar  java . útil . Scanner ;

 classe  pública questão 13 {
    public  static  void  main ( String [] args ) {
        Scanner  enterScanner = new  Scanner ( System . in );
        int  A , B , C , AB , ABC ;
        A = digite Scanner . nextInt ();
        B = digite Scanner . nextInt ();
        C = digite Scanner . nextInt ();
        AB =(( A + B ) + Math . abs ( A - B ))/ 2 ;
        ABC =(( AB + C ) + Math . abs ( AB - C ))/ 2 ;

        Sistema . fora . println ( ABC + " eh o maior" );

    }
}