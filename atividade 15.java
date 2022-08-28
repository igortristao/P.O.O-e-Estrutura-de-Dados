pacote  Atividade ;

importar  java . útil . Scanner ;

 classe  pública questão 15 {
    public  static  void  main ( String [] args ) {
        Scanner  enterScanner = new  Scanner ( System . in );
        duplo  x1 ;
        duplo  y1 ;
        duplo  x2 ;
        duplo  y2 ;
        x1 = digite Scanner . próximoDouble ();
        y1 = digite Scanner . próximoDouble ();
        x2 = digite Scanner . próximoDouble ();
        y2 = digite Scanner . próximoDouble ();
        double  distx = (( x2 - x1 ) * ( x2 - x1 ));
        double  disty = (( y2 - y1 ) * ( y2 - y1 ));
         distância dupla = Math . sqrt (( distx + disty ));

        Sistema . fora . printf ( "%.4f" , distancia );




    }
}