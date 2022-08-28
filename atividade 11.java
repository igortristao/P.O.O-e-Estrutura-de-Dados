pacote  Atividade ;

importar  java . útil . Scanner ;

 classe  pública questão 11 {
    public  static  void  main ( String [] args ) {
        Scanner  enterScanner = new  Scanner ( System . in );
        double  VOLUME , pi , raio ;
        pi = 3,14159 ;

        raio = enterScanner . próximoDouble ();
        VOLUME = ( 4 / 3.0 ) * pi * raio * raio * raio ;

        Sistema . fora . printf ( "VOLUME = %.3f" , VOLUME );



    }
}